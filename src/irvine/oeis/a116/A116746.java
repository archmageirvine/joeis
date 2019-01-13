package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116746.
 * @author Sean A. Irvine
 */
public class A116746 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116746() {
    super(new long[] {-6, -1, 22, -22, 8}, new long[] {1, 2, 6, 21, 75});
  }
}
