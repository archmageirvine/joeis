package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024127 <code>a(n) = 11^n-1</code>.
 * @author Sean A. Irvine
 */
public class A024127 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024127() {
    super(new long[] {-11, 12}, new long[] {0, 10});
  }
}
