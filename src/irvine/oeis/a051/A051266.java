package irvine.oeis.a051;

import irvine.oeis.PositionSequence;

/**
 * A051266 Numbers n such that maximal value of prime divisors of reduced residue system for n is 2.
 * @author Sean A. Irvine
 */
public class A051266 extends PositionSequence {

  /** Construct the sequence. */
  public A051266() {
    super(1, new A051265(), 2);
  }
}

