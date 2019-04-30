package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090309 <code>a(n) = 20a(n-1) + a(n-2)</code>, starting with <code>a(0) = 2</code> and <code>a(1) = 20</code>.
 * @author Sean A. Irvine
 */
public class A090309 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090309() {
    super(new long[] {1, 20}, new long[] {2, 20});
  }
}
