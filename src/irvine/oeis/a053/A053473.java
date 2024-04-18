package irvine.oeis.a053;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A053473 a(n) is the cototient of n (A051953) iterated 5 times.
 * @author Sean A. Irvine
 */
public class A053473 extends A053472 {

  @Override
  public Z next() {
    final Z n = super.next();
    return n.isZero() ? Z.ZERO : n.subtract(Functions.PHI.z(n));
  }
}
