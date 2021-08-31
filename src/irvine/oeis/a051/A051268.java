package irvine.oeis.a051;

import irvine.oeis.PositionSequence;

/**
 * A051268 Numbers n such that maximal value of prime divisors of reduced residue system for n is 4.
 * @author Sean A. Irvine
 */
public class A051268 extends PositionSequence {

  /** Construct the sequence. */
  public A051268() {
    super(1, new A051265(), 4);
  }
}

