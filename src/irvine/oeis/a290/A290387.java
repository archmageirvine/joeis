package irvine.oeis.a290;

import irvine.oeis.FiniteSequence;

/**
 * A290387 Increasing sequence where a(n) is the smallest integer not yet in the sequence with no digits shared with the term a(n-2), no repeated digits, and no 0-digit allowed.
 * @author Georg Fischer
 */
public class A290387 extends FiniteSequence {

  /** Construct the sequence. */
  public A290387() {
    super(1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 13, 34, 42, 51, 53, 62, 64, 71, 72, 82, 83, 91, 92, 234, 314, 516, 526, 723, 731, 814, 824, 923, 931, 1456, 2456, 2738, 3178, 4156, 4256, 7238, 7318, 9145, 9245, 23678, 31678);
  }
}
