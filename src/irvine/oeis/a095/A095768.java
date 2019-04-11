package irvine.oeis.a095;

import irvine.oeis.LinearRecurrence;

/**
 * A095768 <code>a(n) = 2^(n+1) - n</code>.
 * @author Sean A. Irvine
 */
public class A095768 extends LinearRecurrence {

  /** Construct the sequence. */
  public A095768() {
    super(new long[] {2, -5, 4}, new long[] {3, 6, 13});
  }
}
