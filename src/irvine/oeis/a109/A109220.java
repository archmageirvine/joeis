package irvine.oeis.a109;

import irvine.oeis.LinearRecurrence;

/**
 * A109220.
 * @author Sean A. Irvine
 */
public class A109220 extends LinearRecurrence {

  /** Construct the sequence. */
  public A109220() {
    super(new long[] {-1, 0, 2, 2}, new long[] {1, 3, 7, 20});
  }
}
