package irvine.oeis.a032;

import irvine.oeis.LinearRecurrence;

/**
 * A032120.
 * @author Sean A. Irvine
 */
public class A032120 extends LinearRecurrence {

  /** Construct the sequence. */
  public A032120() {
    super(new long[] {-9, 3, 3}, new long[] {1, 3, 6});
  }
}
