package irvine.oeis.a284;

import irvine.oeis.LinearRecurrence;

/**
 * A284307.
 * @author Sean A. Irvine
 */
public class A284307 extends LinearRecurrence {

  /** Construct the sequence. */
  public A284307() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {1, 4, 2, 3, 5});
  }
}
