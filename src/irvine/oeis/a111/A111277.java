package irvine.oeis.a111;

import irvine.oeis.LinearRecurrence;

/**
 * A111277.
 * @author Sean A. Irvine
 */
public class A111277 extends LinearRecurrence {

  /** Construct the sequence. */
  public A111277() {
    super(new long[] {3, -7, 5}, new long[] {1, 1, 2});
  }
}
