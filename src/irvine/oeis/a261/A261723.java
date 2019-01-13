package irvine.oeis.a261;

import irvine.oeis.LinearRecurrence;

/**
 * A261723.
 * @author Sean A. Irvine
 */
public class A261723 extends LinearRecurrence {

  /** Construct the sequence. */
  public A261723() {
    super(new long[] {-2, 0, 3, 0}, new long[] {4, 3, 6, 5});
  }
}
