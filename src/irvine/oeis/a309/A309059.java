package irvine.oeis.a309;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A309059 a(1) = 1; for n &gt; 1, a(n) = 2 if the concatenation of all the previous terms is prime and a(n) = 1 otherwise.
 * @author Sean A. Irvine
 */
public class A309059 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    if (mN.isProbablePrime()) {
      mN = mN.multiply(10).add(2);
      return Z.TWO;
    } else {
      mN = mN.multiply(10).add(1);
      return Z.ONE;
    }
  }
}
