package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168273 <code>a(n) = 2*n + (-1)^n - 1</code>.
 * @author Sean A. Irvine
 */
public class A168273 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168273() {
    super(new long[] {-1, 1, 1}, new long[] {0, 4, 4});
  }
}
