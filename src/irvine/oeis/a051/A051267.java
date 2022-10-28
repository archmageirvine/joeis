package irvine.oeis.a051;

import irvine.oeis.FilterPositionSequence;

/**
 * A051267 Numbers n such that maximal value of prime divisors of reduced residue system for n is 3.
 * @author Sean A. Irvine
 */
public class A051267 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A051267() {
    super(1, new A051265(), 3);
  }
}

