package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000292;

/**
 * A076818 Lexicographically earliest sequence of pairwise coprime tetrahedral numbers.
 * @author Sean A. Irvine
 */
public class A076818 extends Sequence1 {

  private final Sequence mTetrahedral = new A000292().skip();
  private Z mLcm = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      final Z t = mTetrahedral.next();
      if (mLcm.gcd(t).isOne()) {
        mLcm = mLcm.lcm(t);
        return t;
      }
    }
  }
}

