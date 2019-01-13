package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110344.
 * @author Sean A. Irvine
 */
public class A110344 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110344() {
    super(new long[] {1, 0, -3, 0, 3, 0}, new long[] {1, 5, 6, 22, 15, 51});
  }
}
