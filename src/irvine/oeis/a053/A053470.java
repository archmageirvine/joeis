package irvine.oeis.a053;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a051.A051953;

/**
 * A053470 a(n) is the cototient of n (A051953) iterated twice.
 * @author Sean A. Irvine
 */
public class A053470 extends A051953 {

  @Override
  public Z next() {
    final Z n = super.next();
    return n.isZero() ? Z.ZERO : n.subtract(Jaguar.factor(n).phi());
  }
}
