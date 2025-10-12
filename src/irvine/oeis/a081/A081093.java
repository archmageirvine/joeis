package irvine.oeis.a081;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A081093 a(n) is the smallest prime such that the number of 1's in its binary expansion is equal to the n-th prime.
 * @author Sean A. Irvine
 */
public class A081093 extends A000040 {

  @Override
  public Z next() {
    Z t = Z.ONE.shiftLeft(super.next().longValueExact()).subtract(1);
    while (!t.isProbablePrime()) {
      t = Functions.SWIZZLE.z(t);
    }
    return t;
  }
}
