package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A066835 a(n) = omega((prime(n)-1)! + 1), where omega is given by A001221, primes in A000040.
 * @author Sean A. Irvine
 */
public class A066835 extends A000040 {

  @Override
  public Z next() {
    return Functions.OMEGA.z(Functions.FACTORIAL.z(super.next().subtract(1)).add(1));
  }
}
