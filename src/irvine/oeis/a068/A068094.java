package irvine.oeis.a068;

import irvine.oeis.DifferenceSequence;

/**
 * A068094 Number of n-digit triangular numbers.
 * @author Sean A. Irvine
 */
public class A068094 extends DifferenceSequence {

  /** Construct the sequence. */
  public A068094() {
    super(1, new A068092());
  }
}

