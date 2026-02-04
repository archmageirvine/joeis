package irvine.oeis.a083;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083521 Smallest prime that is the product of n consecutive integers + 1, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A083521 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 4) {
      return Z.ZERO;
    }
    Z prod = Functions.FACTORIAL.z(mN);
    long lo = 1;
    long hi = mN;
    while (true) {
      final Z t = prod.add(1);
      if (t.isProbablePrime()) {
        return t;
      }
      prod = prod.divide(lo++).multiply(++hi);
    }
  }
}
