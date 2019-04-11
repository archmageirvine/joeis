package irvine.oeis.a023;

import irvine.oeis.LinearRecurrence;

/**
 * A023443 <code>a(n) = n - 1</code>.
 * @author Sean A. Irvine
 */
public class A023443 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023443() {
    super(new long[] {-1, 2}, new long[] {-1, 0});
  }
}
