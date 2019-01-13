package irvine.oeis.a121;

import irvine.oeis.LinearRecurrence;

/**
 * A121833.
 * @author Sean A. Irvine
 */
public class A121833 extends LinearRecurrence {

  /** Construct the sequence. */
  public A121833() {
    super(new long[] {1, 0, 0, 1, 1, 0}, new long[] {1, 0, 1, 1, 1, 2});
  }
}
