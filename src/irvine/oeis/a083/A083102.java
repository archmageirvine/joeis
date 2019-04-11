package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083102 <code>a(n) = 2*a(n-1) + 10*a(n-2)</code>.
 * @author Sean A. Irvine
 */
public class A083102 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083102() {
    super(new long[] {10, 2}, new long[] {1, 2});
  }
}
