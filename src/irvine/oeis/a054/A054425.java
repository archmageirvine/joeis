package irvine.oeis.a054;

import java.util.HashMap;

import irvine.math.LongUtils;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.SkipSequence;
import irvine.oeis.a007.A007305;
import irvine.oeis.a047.A047679;

/**
 * A054425 A054424 expanded to normal triangular array, with zeros at those (x,y) where x and y are not relatively prime.
 * @author Sean A. Irvine
 */
public class A054425 extends Sequence1 {

  private final HashMap<Q, Long> mSternBrocotMap = new HashMap<>();
  private long mSternBrocotMapIndex = 0;
  private final Sequence mSternBrocotNum = new SkipSequence(new A007305(), 2);
  private final Sequence mSternBrocotDen = new A047679();
  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    if (LongUtils.gcd(mM, mN - mM + 1) != 1) {
      return Z.ZERO;
    }
    final Q q = new Q(mM, mN - mM + 1);
    Long pos;
    while ((pos = mSternBrocotMap.remove(q)) == null) {
      final Q sb = new Q(mSternBrocotNum.next(), mSternBrocotDen.next());
      mSternBrocotMap.put(sb, ++mSternBrocotMapIndex);
    }
    return Z.valueOf(pos);
  }
}
