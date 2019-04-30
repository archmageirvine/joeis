package irvine.oeis.a299;

import irvine.oeis.LinearRecurrence;

/**
 * A299645 Numbers of the form m*(8*m <code>+ 5)</code>, where m is an integer.
 * @author Sean A. Irvine
 */
public class A299645 extends LinearRecurrence {

  /** Construct the sequence. */
  public A299645() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 3, 13, 22, 42});
  }
}
