package irvine.oeis.a275;

import irvine.oeis.LinearRecurrence;

/**
 * A275970 <code>a(n) = 3*2^n + n - 1</code>.
 * @author Sean A. Irvine
 */
public class A275970 extends LinearRecurrence {

  /** Construct the sequence. */
  public A275970() {
    super(new long[] {2, -5, 4}, new long[] {2, 6, 13});
  }
}
