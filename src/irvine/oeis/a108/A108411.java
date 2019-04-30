package irvine.oeis.a108;

import irvine.oeis.LinearRecurrence;

/**
 * A108411 <code>a(n) = 3^floor(n/2)</code>. Powers of 3 repeated.
 * @author Sean A. Irvine
 */
public class A108411 extends LinearRecurrence {

  /** Construct the sequence. */
  public A108411() {
    super(new long[] {3, 0}, new long[] {1, 1});
  }
}
