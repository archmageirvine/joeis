package irvine.oeis.a063;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a046.A046755;

/**
 * A063921 Quotients arising when A046755(n) is divided by the cube of the number of its divisors.
 * @author Sean A. Irvine
 */
public class A063921 extends A046755 {

  @Override
  public Z next() {
    final Z t = super.next();
    return t.divide(Functions.SIGMA0.z(t).pow(3));
  }
}
