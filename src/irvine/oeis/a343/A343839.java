package irvine.oeis.a343;

import irvine.oeis.FiniteSequence;

/**
 * A343839 Semi-one numbers: Positive integers k such that exactly half of the integers 1..k have a 1 in their decimal expansion.
 * @author Sean A. Irvine
 */
public class A343839 extends FiniteSequence {

  /** Construct the sequence. */
  public A343839() {
    super(1, FINITE, 2, 16, 24, 160, 270, 272, 1456, 3398, 3418, 3420, 3422, 13120, 44686, 118096, 674934, 1062880);
  }
}
