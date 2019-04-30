package irvine.oeis.a214;

import irvine.oeis.LinearRecurrence;

/**
 * A214954 <code>a(n) = 3*a(n-1) + 6*a(n-2) + a(n-3)</code>, with <code>a(0) = 0, a(1) = 2</code>, and <code>a(2) = 7</code>.
 * @author Sean A. Irvine
 */
public class A214954 extends LinearRecurrence {

  /** Construct the sequence. */
  public A214954() {
    super(new long[] {1, 6, 3}, new long[] {0, 2, 7});
  }
}
