package irvine.oeis.a290;

import irvine.oeis.FiniteSequence;

/**
 * A290386 Increasing sequence <code>a(n)&gt;a(n-1)</code> where a(n)=smallest integer not yet in the sequence with no digits shared with the previous term <code>a(n-1),</code> no repeated digits, and no 0-digit allowed.
 * @author Georg Fischer
 */
public class A290386 extends FiniteSequence {

  /** Construct the sequence. */
  public A290386() {
    super(1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 34, 51, 62, 71, 82, 91, 234, 516, 723, 814, 923, 1456, 2378, 4156, 7238, 9145, 23678);
  }
}
