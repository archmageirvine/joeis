package irvine.oeis.a076;

import irvine.oeis.LinearRecurrence;

/**
 * A076765.
 * @author Sean A. Irvine
 */
public class A076765 extends LinearRecurrence {

  /** Construct the sequence. */
  public A076765() {
    super(new long[] {1, -9, 9}, new long[] {1, 9, 72});
  }
}
