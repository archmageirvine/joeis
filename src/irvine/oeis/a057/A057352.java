package irvine.oeis.a057;

import irvine.oeis.PartialSumSequence;

/**
 * A057352 Number of Gaussian primes (in the first half-quadrant; i.e., 0 to 45 degrees) with real part &lt;= n.
 * @author Sean A. Irvine
 */
public class A057352 extends PartialSumSequence {

  /** Construct the sequence. */
  public A057352() {
    super(new A057368());
  }
}
