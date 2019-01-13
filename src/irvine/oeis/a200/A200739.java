package irvine.oeis.a200;

import irvine.oeis.LinearRecurrence;

/**
 * A200739.
 * @author Sean A. Irvine
 */
public class A200739 extends LinearRecurrence {

  /** Construct the sequence. */
  public A200739() {
    super(new long[] {1, -1, 5}, new long[] {1, 0, 0});
  }
}
