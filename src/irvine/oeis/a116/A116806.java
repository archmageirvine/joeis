package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116806.
 * @author Sean A. Irvine
 */
public class A116806 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116806() {
    super(new long[] {-4, 20, -45, 52, -31, 9}, new long[] {1, 2, 6, 21, 75, 262});
  }
}
