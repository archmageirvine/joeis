package irvine.oeis.a261;

import irvine.oeis.LinearRecurrence;

/**
 * A261120.
 * @author Sean A. Irvine
 */
public class A261120 extends LinearRecurrence {

  /** Construct the sequence. */
  public A261120() {
    super(new long[] {21, -31, 11}, new long[] {2, 17, 134});
  }
}
