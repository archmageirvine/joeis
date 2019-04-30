package irvine.oeis.a001;

import irvine.oeis.LinearRecurrence;

/**
 * A001634 <code>a(n) = a(n-2) + a(n-3) + a(n-4)</code>, with initial values <code>a(0) = 0, a(1) = 2, a(2) = 3, a(3) = 6</code>.
 * @author Sean A. Irvine
 */
public class A001634 extends LinearRecurrence {

  /** Construct the sequence. */
  public A001634() {
    super(new long[] {1, 1, 1, 0}, new long[] {0, 2, 3, 6});
  }
}
