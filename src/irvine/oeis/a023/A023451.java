package irvine.oeis.a023;

import irvine.oeis.LinearRecurrence;

/**
 * A023451 <code>a(n) = n-9</code>.
 * @author Sean A. Irvine
 */
public class A023451 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023451() {
    super(new long[] {-1, 2}, new long[] {-9, -8});
  }
}
