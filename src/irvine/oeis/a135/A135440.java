package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135440 <code>a(n) = a(n-1) + 2a(n-2)</code>.
 * @author Sean A. Irvine
 */
public class A135440 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135440() {
    super(new long[] {2, 1}, new long[] {-1, 4});
  }
}
