package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024141 <code>a(n) = 12^n - n</code>.
 * @author Sean A. Irvine
 */
public class A024141 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024141() {
    super(new long[] {12, -25, 14}, new long[] {1, 11, 142});
  }
}
