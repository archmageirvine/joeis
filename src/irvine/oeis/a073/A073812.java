package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A073812 Number of common divisors of sigma(n) and phi(n).
 * @author Sean A. Irvine
 */
public class A073812 extends LambdaSequence {

  /** Construct the sequence. */
  public A073812() {
    super(1, n -> Functions.SIGMA0.z(Functions.GCD.z(Functions.SIGMA.z(n), Functions.PHI.z(n))));
  }
}
