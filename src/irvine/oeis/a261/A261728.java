package irvine.oeis.a261;

import irvine.oeis.LinearRecurrence;

/**
 * A261728.
 * @author Sean A. Irvine
 */
public class A261728 extends LinearRecurrence {

  /** Construct the sequence. */
  public A261728() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0}, new long[] {1, 3, 4, 6, 2, 9, 7, 12, 10, 15, 5, 18});
  }
}
