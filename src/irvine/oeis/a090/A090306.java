package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090306 <code>a(n) = 17a(n-1) + a(n-2)</code>, starting with <code>a(0) = 2</code> and <code>a(1) = 17</code>.
 * @author Sean A. Irvine
 */
public class A090306 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090306() {
    super(new long[] {1, 17}, new long[] {2, 17});
  }
}
