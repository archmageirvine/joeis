package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116786.
 * @author Sean A. Irvine
 */
public class A116786 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116786() {
    super(new long[] {6, -31, 70, -90, 71, -34, 9}, new long[] {1, 2, 6, 21, 72, 228, 670});
  }
}
