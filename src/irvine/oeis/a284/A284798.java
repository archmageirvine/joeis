package irvine.oeis.a284;

import irvine.oeis.FixedPointPositionSequence;

/**
 * A284798 Antipalindromic numbers in base 3.
 * @author Sean A. Irvine
 */
public class A284798 extends FixedPointPositionSequence {

  /** Construct the sequence. */
  public A284798() {
    super(1, new A284797());
  }
}
