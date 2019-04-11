package irvine.oeis.a023;

import irvine.oeis.LinearRecurrence;

/**
 * A023474 <code>n-32</code>.
 * @author Sean A. Irvine
 */
public class A023474 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023474() {
    super(new long[] {-1, 2}, new long[] {-32, -31});
  }
}
