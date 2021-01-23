package irvine.oeis.a291;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;

/**
 * A291805 a(n) = phi(A291789(n)).
 * @author Sean A. Irvine
 */
public class A291805 extends A291789 {

  @Override
  public Z next() {
    return Jaguar.factor(super.next()).phi();
  }
}
