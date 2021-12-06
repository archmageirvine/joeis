package irvine.oeis.a067;

import irvine.oeis.HolonomicRecurrence;

/**
 * A067353 Divide the natural numbers in sets of consecutive numbers starting with {1,2} as the first set. The number of elements of the n-th set is equal to the sum of the n-1 final numbers in the (n-1)st set. The final number of the n-th set gives a(n).
 * The number of elements of the n-th set is equal to the sum of the n-1 final numbers in the (n-1)st set.
 * The final number of the n-th set gives a(n).
 * @author Georg Fischer
 */
public class A067353 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A067353() {
    super(1, "[[-2, 3,-1],[0, 2],[-2]]", "2", 0);
  }
}
