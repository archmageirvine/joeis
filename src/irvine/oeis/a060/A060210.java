package irvine.oeis.a060;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a001.A001359;

/**
 * A060210 Largest prime factor of 1+smaller term of twin primes.
 * @author Sean A. Irvine
 */
public class A060210 extends A001359 {

  @Override
  public Z next() {
    return Functions.GPF.z(super.next().add(1));
  }
}

