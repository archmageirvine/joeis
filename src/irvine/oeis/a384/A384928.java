package irvine.oeis.a384;

import irvine.oeis.a000.A000217;
import irvine.oeis.a386.A386993;

/**
 * A384928 Number of 2-dense sublists of divisors of the n-th triangular number.
 * @author Sean A. Irvine
 */
public class A384928 extends A386993 {

  /** Construct the sequence. */
  public A384928() {
    super(0, new A000217());
  }
}

