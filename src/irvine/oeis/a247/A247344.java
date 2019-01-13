package irvine.oeis.a247;

import irvine.oeis.LinearRecurrence;

/**
 * A247344.
 * @author Sean A. Irvine
 */
public class A247344 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247344() {
    super(new long[] {1280, -1600, 800, -200, 25}, new long[] {1, 1, 1, 1, 1});
  }
}
