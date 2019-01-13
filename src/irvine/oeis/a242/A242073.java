package irvine.oeis.a242;

import irvine.oeis.LinearRecurrence;

/**
 * A242073.
 * @author Sean A. Irvine
 */
public class A242073 extends LinearRecurrence {

  /** Construct the sequence. */
  public A242073() {
    super(new long[] {-1, 0, 0, 0, 0, 0}, new long[] {1, -1, -1, -2, 1, -1});
  }
}
