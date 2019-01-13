package irvine.oeis.a261;

import irvine.oeis.LinearRecurrence;

/**
 * A261064.
 * @author Sean A. Irvine
 */
public class A261064 extends LinearRecurrence {

  /** Construct the sequence. */
  public A261064() {
    super(new long[] {-9, 24, -22, 8}, new long[] {1, 6, 26, 100});
  }
}
