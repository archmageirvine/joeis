package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090300 <code>a(n) = 14*a(n-1) + a(n-2)</code>, starting with <code>a(0) = 2</code> and <code>a(1) = 14</code>.
 * @author Sean A. Irvine
 */
public class A090300 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090300() {
    super(new long[] {1, 14}, new long[] {2, 14});
  }
}
