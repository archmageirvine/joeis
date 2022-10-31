package irvine.oeis.a053;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;

/**
 * A053789 a(n) = A020639(A053790(n)).
 * @author Sean A. Irvine
 */
public class A053789 extends A053790 {

  {
  }

  @Override
  public Z next() {
    final Z[] t = Jaguar.factor(super.next()).toZArray();
    return t.length == 0 ? Z.ONE : t[0];
  }
}
