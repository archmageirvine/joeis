package irvine.oeis.a159;

import irvine.oeis.LinearRecurrence;

/**
 * A159286.
 * @author Sean A. Irvine
 */
public class A159286 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159286() {
    super(new long[] {2, 1, 0}, new long[] {1, -2, 2});
  }
}
