package irvine.oeis.a049;

import irvine.oeis.LinearRecurrence;

/**
 * A049294.
 * @author Sean A. Irvine
 */
public class A049294 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049294() {
    super(new long[] {12, -20, 9}, new long[] {1, 13, 97});
  }
}
