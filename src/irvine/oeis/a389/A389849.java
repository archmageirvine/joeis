package irvine.oeis.a389;

import irvine.oeis.FiniteSequence;

/**
 * A389849 Smallest number of the form a^b, with 1 &lt; a and 1 &lt; b and a != b, for which the digit sets of a^b and b^a share exactly n digits.
 * @author Sean A. Irvine
 */
public class A389849 extends FiniteSequence {

  /** Construct the sequence. */
  public A389849() {
    super(1, FINITE, 8, 25, 16, 1296, 2704, 12769, 103684, 1034289, 10278436, 102495376, 1026753849);
  }
}

