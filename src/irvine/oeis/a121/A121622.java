package irvine.oeis.a121;

import irvine.oeis.LinearRecurrence;

/**
 * A121622 Real part of <code>(3 + 2i)^n</code>.
 * @author Sean A. Irvine
 */
public class A121622 extends LinearRecurrence {

  /** Construct the sequence. */
  public A121622() {
    super(new long[] {-13, 6}, new long[] {1, 3});
  }
}
