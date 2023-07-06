package irvine.oeis.a054;

import java.util.HashMap;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a007.A007305;
import irvine.oeis.a038.A038566;
import irvine.oeis.a038.A038567;
import irvine.oeis.a047.A047679;

/**
 * A054427 Permutation of natural numbers: maps the fractions A038567/A038566 to the right side (n/m &gt; 1) of Stern-Brocot tree.
 * @author Sean A. Irvine
 */
public class A054427 extends Sequence1 {

  private final HashMap<Q, Long> mSternBrocotMap = new HashMap<>();
  private long mSternBrocotMapIndex = 0;
  private final Sequence mSternBrocotNum = new A007305().skip(2);
  private final Sequence mSternBrocotDen = new A047679();
  private final Sequence mNum = new A038567();
  private final Sequence mDen = new A038566();

  @Override
  public Z next() {
    final Q q = new Q(mNum.next(), mDen.next());
    Long pos;
    while ((pos = mSternBrocotMap.remove(q)) == null) {
      final Q sb = new Q(mSternBrocotNum.next(), mSternBrocotDen.next());
      if (sb.compareTo(Q.ONE) >= 0) {
        mSternBrocotMap.put(sb, ++mSternBrocotMapIndex);
      }
    }
    return Z.valueOf(pos);
  }
}
