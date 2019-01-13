package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116742.
 * @author Sean A. Irvine
 */
public class A116742 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116742() {
    super(new long[] {2, -13, 28, -23, 8}, new long[] {1, 2, 6, 21, 75});
  }
}
