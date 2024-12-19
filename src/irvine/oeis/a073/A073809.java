package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A073809 Number of common divisors of sigma_1(n) and sigma_3(n).
 * @author Sean A. Irvine
 */
public class A073809 extends LambdaSequence {

  /** Construct the sequence. */
  public A073809() {
    super(1, n -> Functions.SIGMA0.z(Functions.GCD.z(Functions.SIGMA1.z(n), Functions.SIGMA.z(3, n))));
  }
}
