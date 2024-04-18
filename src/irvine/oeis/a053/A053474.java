package irvine.oeis.a053;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a005.A005278;

/**
 * A053474 Cototients of non-cototient numbers: A051953(A005278(n)).
 * @author Sean A. Irvine
 */
public class A053474 extends A005278 {

  @Override
  public Z next() {
    final Z n = super.next();
    return n.subtract(Functions.PHI.z(n));
  }
}
