package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021794.
 * @author Sean A. Irvine
 */
public class A021794 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021794() {
    super(new long[] {-240, 368, -149, 22}, new long[] {1, 22, 335, 4460});
  }
}
