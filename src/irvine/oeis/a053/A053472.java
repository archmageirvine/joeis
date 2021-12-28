package irvine.oeis.a053;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;

/**
 * A053472 a(n) is the cototient of n (A051953) iterated 4 times.
 * @author Sean A. Irvine
 */
public class A053472 extends A053471 {

  @Override
  public Z next() {
    final Z n = super.next();
    return n.isZero() ? Z.ZERO : n.subtract(Cheetah.factor(n).phi());
  }
}
