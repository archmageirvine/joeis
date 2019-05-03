package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178073 Partial sums of sequence <code>A177342</code>.
 * @author Sean A. Irvine
 */
public class A178073 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178073() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 10, 41, 116, 265});
  }
}
