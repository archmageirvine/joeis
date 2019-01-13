package irvine.oeis.a076;

import irvine.oeis.LinearRecurrence;

/**
 * A076824.
 * @author Sean A. Irvine
 */
public class A076824 extends LinearRecurrence {

  /** Construct the sequence. */
  public A076824() {
    super(new long[] {1, 0, 0, 0, 0}, new long[] {1, 1, 3, 5, 3});
  }
}
