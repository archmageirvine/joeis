package irvine.oeis.a176;

import irvine.oeis.LinearRecurrence;

/**
 * A176592 List of pairs <code>n,11*n</code>.
 * @author Sean A. Irvine
 */
public class A176592 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176592() {
    super(new long[] {-1, 0, 2, 0}, new long[] {1, 11, 2, 22});
  }
}
