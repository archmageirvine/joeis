package irvine.oeis.a121;

import irvine.oeis.LinearRecurrence;

/**
 * A121621 Real part of <code>(2 + 3i)^n</code>.
 * @author Sean A. Irvine
 */
public class A121621 extends LinearRecurrence {

  /** Construct the sequence. */
  public A121621() {
    super(new long[] {-13, 4}, new long[] {1, 2});
  }
}
