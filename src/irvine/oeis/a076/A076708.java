package irvine.oeis.a076;

import irvine.oeis.LinearRecurrence;

/**
 * A076708.
 * @author Sean A. Irvine
 */
public class A076708 extends LinearRecurrence {

  /** Construct the sequence. */
  public A076708() {
    super(new long[] {1, -7, 7}, new long[] {0, 5, 34});
  }
}
