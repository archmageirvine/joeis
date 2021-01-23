package irvine.oeis.a057;

import irvine.oeis.LinearRecurrence;

/**
 * A057569 Numbers of the form k*(5*k+1)/2 or k*(5*k-1)/2.
 * @author Sean A. Irvine
 */
public class A057569 extends LinearRecurrence {

  /** Construct the sequence. */
  public A057569() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 2, 3, 9, 11});
  }
}
