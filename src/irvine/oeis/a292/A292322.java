package irvine.oeis.a292;

import irvine.oeis.LinearRecurrence;

/**
 * A292322.
 * @author Sean A. Irvine
 */
public class A292322 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292322() {
    super(new long[] {1, 0, 1, -3, -1, -2, 4, 1, 1}, new long[] {1, 2, 4, 8, 17, 36, 73, 152, 317});
  }
}
