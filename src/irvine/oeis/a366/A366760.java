package irvine.oeis.a366;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a038.A038507;

/**
 * A366760 a(n) = phi(n!+1), where phi is Euler's totient function (A000010).
 * @author Sean A. Irvine
 */
public class A366760 extends A038507 {

  @Override
  public Z next() {
    return Functions.PHI.z(super.next());
  }
}
