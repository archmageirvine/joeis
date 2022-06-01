package irvine.oeis.a121;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A121621 Real part of (2 + 3i)^n.
 * @author Sean A. Irvine
 */
public class A121621 extends LinearRecurrence {

  /** Construct the sequence. */
  public A121621() {
    super(new long[] {-13, 4}, new long[] {1, 2});
  }
}
