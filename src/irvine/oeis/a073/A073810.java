package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A073810 Number of common divisors of sigma(2,n) and sigma(3,n).
 * @author Sean A. Irvine
 */
public class A073810 extends LambdaSequence {

  /** Construct the sequence. */
  public A073810() {
    super(1, n -> Functions.SIGMA0.z(Functions.GCD.z(Functions.SIGMA.z(2, n), Functions.SIGMA.z(3, n))));
  }
}
