package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116843.
 * @author Sean A. Irvine
 */
public class A116843 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116843() {
    super(new long[] {-4, 32, -105, 187, -199, 130, -51, 11}, new long[] {1, 2, 6, 21, 73, 241, 759, 2305});
  }
}
