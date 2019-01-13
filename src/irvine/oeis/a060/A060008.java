package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060008.
 * @author Sean A. Irvine
 */
public class A060008 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060008() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 0, 0, 0, 9});
  }
}
