package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022321 <code>a(n) = a(n-1) + a(n-2) + 1,</code> with <code>a(0) = 1</code> and <code>a(1) = 7</code>.
 * @author Sean A. Irvine
 */
public class A022321 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022321() {
    super(new long[] {-1, 0, 2}, new long[] {1, 7, 9});
  }
}
