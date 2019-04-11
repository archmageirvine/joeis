package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024076 <code>7^n-n</code>.
 * @author Sean A. Irvine
 */
public class A024076 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024076() {
    super(new long[] {7, -15, 9}, new long[] {1, 6, 47});
  }
}
