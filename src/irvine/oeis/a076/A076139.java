package irvine.oeis.a076;

import irvine.oeis.LinearRecurrence;

/**
 * A076139.
 * @author Sean A. Irvine
 */
public class A076139 extends LinearRecurrence {

  /** Construct the sequence. */
  public A076139() {
    super(new long[] {1, -15, 15}, new long[] {0, 1, 15});
  }
}
