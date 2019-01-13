package irvine.oeis.a261;

import irvine.oeis.LinearRecurrence;

/**
 * A261540.
 * @author Sean A. Irvine
 */
public class A261540 extends LinearRecurrence {

  /** Construct the sequence. */
  public A261540() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {0, 29, 478, 4287, 24476, 101785, 337434, 946043});
  }
}
