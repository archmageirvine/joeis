package irvine.oeis.a057;

import irvine.oeis.LinearRecurrence;

/**
 * A057569 Numbers of the form <code>k*(5*k+1)/2</code> or <code>k*(5*k-1)/2</code>.
 * @author Sean A. Irvine
 */
public class A057569 extends LinearRecurrence {

  /** Construct the sequence. */
  public A057569() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 2, 3, 9, 11});
  }
}
