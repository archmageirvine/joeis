package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158414 <code>961n + 1</code>.
 * @author Sean A. Irvine
 */
public class A158414 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158414() {
    super(new long[] {-1, 2}, new long[] {962, 1923});
  }
}
