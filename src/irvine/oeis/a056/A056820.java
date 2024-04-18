package irvine.oeis.a056;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002064;

/**
 * A056820 Euler totient function of Cullen numbers (A002064), n*2^n +1.
 * @author Sean A. Irvine
 */
public class A056820 extends A002064 {

  @Override
  public Z next() {
    return Functions.PHI.z(super.next());
  }
}

