package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059877 Those n for which the absolute value of A059876[n] is prime.
 * @author Sean A. Irvine
 */
public class A059877 extends A059876 {

  @Override
  public Z next() {
    while (!super.next().abs().isProbablePrime()) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}
