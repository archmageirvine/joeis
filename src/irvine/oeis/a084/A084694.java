package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.a007.A007675;

/**
 * A084694 Squarefree numbers which are products of three consecutive numbers. I.e., squarefree numbers of the form k^3 - k.
 * @author Sean A. Irvine
 */
public class A084694 extends A007675 {

  @Override
  public Z next() {
    final Z n = super.next();
    return n.multiply(n.add(1)).multiply(n.add(2));
  }
}
