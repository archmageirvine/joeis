package irvine.oeis.a292;

import irvine.oeis.LinearRecurrence;

/**
 * A292277.
 * @author Sean A. Irvine
 */
public class A292277 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292277() {
    super(new long[] {-8, 8, 4}, new long[] {0, 2, 8});
  }
}
