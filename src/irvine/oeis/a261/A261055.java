package irvine.oeis.a261;

import irvine.oeis.LinearRecurrence;

/**
 * A261055.
 * @author Sean A. Irvine
 */
public class A261055 extends LinearRecurrence {

  /** Construct the sequence. */
  public A261055() {
    super(new long[] {1, 3, 0, -5, 0, 3}, new long[] {1, 5, 14, 36, 83, 182});
  }
}
