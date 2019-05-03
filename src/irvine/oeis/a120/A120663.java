package irvine.oeis.a120;

import irvine.oeis.LinearRecurrence;

/**
 * A120663 Sequence produced by Markov chain based on <code>20 X 20</code> pentagonal prism bonding graph.
 * @author Sean A. Irvine
 */
public class A120663 extends LinearRecurrence {

  /** Construct the sequence. */
  public A120663() {
    super(new long[] {-144, 84, 152, -93, -7, 9}, new long[] {0, 67, 3079, 65458, 436705, 3325420});
  }
}
