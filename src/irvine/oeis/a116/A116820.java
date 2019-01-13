package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116820.
 * @author Sean A. Irvine
 */
public class A116820 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116820() {
    super(new long[] {1, -14, 29, -23, 8}, new long[] {1, 2, 6, 21, 75});
  }
}
