package irvine.oeis.a053;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000051;

/**
 * A053285 Totient of 2^n+1.
 * @author Sean A. Irvine
 */
public class A053285 extends A000051 {

  @Override
  public Z next() {
    return Functions.PHI.z(super.next());
  }
}

