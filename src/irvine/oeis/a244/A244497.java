package irvine.oeis.a244;

import irvine.oeis.LinearRecurrence;

/**
 * A244497 Number of magic labelings of the prism graph I X <code>C_5</code> with magic sum n.
 * @author Sean A. Irvine
 */
public class A244497 extends LinearRecurrence {

  /** Construct the sequence. */
  public A244497() {
    super(new long[] {-1, 5, -9, 5, 5, -9, 5}, new long[] {1, 11, 57, 197, 533, 1223, 2494});
  }
}
