package irvine.oeis.a056;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a003.A003261;

/**
 * A056821 Totient of the Woodall numbers (A003261), n*2^n -1.
 * @author Sean A. Irvine
 */
public class A056821 extends A003261 {

  @Override
  public Z next() {
    return Functions.PHI.z(super.next());
  }
}

