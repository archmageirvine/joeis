package irvine.oeis.a121;

import irvine.oeis.LinearRecurrence;

/**
 * A121832.
 * @author Sean A. Irvine
 */
public class A121832 extends LinearRecurrence {

  /** Construct the sequence. */
  public A121832() {
    super(new long[] {1, 1, 0, 0, 0, 1}, new long[] {1, 1, 1, 1, 1, 2});
  }
}
