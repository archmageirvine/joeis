package irvine.oeis.a086;

import irvine.oeis.LinearRecurrence;

/**
 * A086902 <code>a(n) = 7*a(n-1) + a(n-2)</code>, starting with <code>a(0) = 2</code> and <code>a(1) = 7</code>.
 * @author Sean A. Irvine
 */
public class A086902 extends LinearRecurrence {

  /** Construct the sequence. */
  public A086902() {
    super(new long[] {1, 7}, new long[] {2, 7});
  }
}
