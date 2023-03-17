package irvine.oeis.a053;

import irvine.math.z.Euler;
import irvine.math.z.Z;

/**
 * A053471 a(n) is the cototient of n (A051953) iterated 3 times.
 * @author Sean A. Irvine
 */
public class A053471 extends A053470 {

  @Override
  public Z next() {
    final Z n = super.next();
    return n.isZero() ? Z.ZERO : n.subtract(Euler.phi(n));
  }
}
