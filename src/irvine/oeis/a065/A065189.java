package irvine.oeis.a065;

import irvine.oeis.InverseSequence;

/**
 * A065189 "Greedy Queens" permutation of the natural numbers, inverse of A065188.
 * @author Sean A. Irvine
 */
public class A065189 extends InverseSequence {

  /** Construct the sequence. */
  public A065189() {
    super(1, new A065188(), 1);
  }
}
