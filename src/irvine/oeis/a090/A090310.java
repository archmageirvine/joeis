package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090310 <code>a(n) = 21*a(n-1) + a(n-2)</code>, starting with <code>a(0) = 2</code> and <code>a(1) = 21</code>.
 * @author Sean A. Irvine
 */
public class A090310 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090310() {
    super(new long[] {1, 21}, new long[] {2, 21});
  }
}
