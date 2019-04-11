package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024039 <code>a(n) = 4^n - n^3</code>.
 * @author Sean A. Irvine
 */
public class A024039 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024039() {
    super(new long[] {4, -17, 28, -22, 8}, new long[] {1, 3, 8, 37, 192});
  }
}
