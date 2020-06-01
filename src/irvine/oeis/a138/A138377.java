package irvine.oeis.a138;

import irvine.oeis.LinearRecurrence;

/**
 * A138377 <code>a(0) = 0, a(1) = 1, a(2) = 3, a(3) = 2;</code> thereafter <code>a(n) = -4*a(n-4)</code>.
 * @author Sean A. Irvine
 */
public class A138377 extends LinearRecurrence {

  /** Construct the sequence. */
  public A138377() {
    super(new long[] {-4, 0, 0, 0}, new long[] {0, 1, 3, 2});
  }
}
