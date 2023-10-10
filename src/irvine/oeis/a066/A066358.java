package irvine.oeis.a066;

import irvine.oeis.NoncomputableSequence;

/**
 * A066358 Recurring permutations: a(n) = P(a(n-1),a(n-2)) where P(x,y) = x!/(x-y)!.
 * @author Sean A. Irvine
 */
public class A066358 extends NoncomputableSequence {

  /** Construct the sequence. */
  public A066358() {
    super(0, NONCOMPUTABLE, 1, 3, 3, 6, 120, 2629976731200L);
  }
}
