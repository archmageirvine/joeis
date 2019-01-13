package irvine.oeis.a127;

import irvine.oeis.LinearRecurrence;

/**
 * A127617.
 * @author Sean A. Irvine
 */
public class A127617 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127617() {
    super(new long[] {-1, 2, 5, 3}, new long[] {1, 1, 5, 22});
  }
}
