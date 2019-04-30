package irvine.oeis.a092;

import irvine.oeis.LinearRecurrence;

/**
 * A092264 <code>a(n)*a(n-5) = a(n-1)*a(n-4)+a(n-2)+a(n-3)</code>, with initial terms <code>a(1) = ... = a(5) = 1</code>.
 * @author Sean A. Irvine
 */
public class A092264 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092264() {
    super(new long[] {1, 0, 0, 0, -28, 0, 0, 0, 28, 0, 0, 0}, new long[] {1, 1, 1, 1, 1, 3, 5, 9, 17, 65, 117, 227});
  }
}
