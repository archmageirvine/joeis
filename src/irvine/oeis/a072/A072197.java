package irvine.oeis.a072;

import irvine.oeis.LinearRecurrence;

/**
 * A072197 <code>a(n) = 4*a(n-1) + 1</code> with <code>a(0) = 3</code>.
 * @author Sean A. Irvine
 */
public class A072197 extends LinearRecurrence {

  /** Construct the sequence. */
  public A072197() {
    super(new long[] {-4, 5}, new long[] {3, 13});
  }
}
