package irvine.oeis.a054;

import java.util.HashMap;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a007.A007305;
import irvine.oeis.a020.A020652;
import irvine.oeis.a020.A020653;
import irvine.oeis.a047.A047679;

/**
 * A054424 Permutation of natural numbers: maps the canonical list of fractions (A020652/A020653) to whole Stern-Brocot (Farey) tree (top = 1/1 and both sides &lt; 1 and &gt; 1, but excluding the "fractions" 0/1 and 1/0).
 * @author Sean A. Irvine
 */
public class A054424 extends Sequence1 {

  private final HashMap<Q, Long> mSternBrocotMap = new HashMap<>();
  private long mSternBrocotMapIndex = 0;
  private final Sequence mSternBrocotNum = new A007305().skip(2);
  private final Sequence mSternBrocotDen = new A047679();
  private final Sequence mNum = new A020652();
  private final Sequence mDen = new A020653();

  @Override
  public Z next() {
    final Q q = new Q(mNum.next(), mDen.next());
    Long pos;
    while ((pos = mSternBrocotMap.remove(q)) == null) {
      final Q sb = new Q(mSternBrocotNum.next(), mSternBrocotDen.next());
      mSternBrocotMap.put(sb, ++mSternBrocotMapIndex);
    }
    return Z.valueOf(pos);
  }
}
