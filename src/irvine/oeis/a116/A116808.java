package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116808.
 * @author Sean A. Irvine
 */
public class A116808 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116808() {
    super(new long[] {-2, 11, -21, 6, 41, -78, 69, -34, 9}, new long[] {1, 2, 6, 21, 71, 213, 569, 1389, 3175});
  }
}
