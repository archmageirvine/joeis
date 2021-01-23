package irvine.oeis.a023;

import irvine.oeis.LinearRecurrence;

/**
 * A023447 a(n) = n-5.
 * @author Sean A. Irvine
 */
public class A023447 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023447() {
    super(new long[] {-1, 2}, new long[] {-5, -4});
  }
}
