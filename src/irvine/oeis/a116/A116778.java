package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116778.
 * @author Sean A. Irvine
 */
public class A116778 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116778() {
    super(new long[] {-3, 13, -25, 28, -19, 7}, new long[] {1, 2, 6, 21, 73, 240});
  }
}
