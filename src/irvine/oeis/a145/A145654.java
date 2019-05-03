package irvine.oeis.a145;

import irvine.oeis.LinearRecurrence;

/**
 * A145654 Partial sums of <code>A000918</code>, starting from index 1.
 * @author Sean A. Irvine
 */
public class A145654 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145654() {
    super(new long[] {2, -5, 4}, new long[] {0, 2, 8});
  }
}
