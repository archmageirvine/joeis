package irvine.oeis.a261;

import irvine.oeis.LinearRecurrence;

/**
 * A261935.
 * @author Sean A. Irvine
 */
public class A261935 extends LinearRecurrence {

  /** Construct the sequence. */
  public A261935() {
    super(new long[] {1, -1, -70, 70, 1}, new long[] {5, 23, 933, 2175, 65849});
  }
}
