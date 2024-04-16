package irvine.oeis.a066;

import irvine.math.factorial.BinarySplitFactorial;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A066835 a(n) = omega((prime(n)-1)! + 1), where omega is given by A001221, primes in A000040.
 * @author Sean A. Irvine
 */
public class A066835 extends A000040 {

  private final BinarySplitFactorial mFactorial = new BinarySplitFactorial();

  @Override
  public Z next() {
    return Z.valueOf(Functions.OMEGA.i(mFactorial.factorial(super.next().subtract(1).intValueExact()).add(1)));
  }
}
