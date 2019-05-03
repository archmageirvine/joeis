package irvine.oeis.a238;

import irvine.oeis.LinearRecurrence;

/**
 * A238828 <code>a(0)=0</code>; thereafter <code>a(n) = A238824(n-1)+A238825(n)</code>.
 * @author Sean A. Irvine
 */
public class A238828 extends LinearRecurrence {

  /** Construct the sequence. */
  public A238828() {
    super(new long[] {-1, 2, 4, 2, -3, -4, 3, 2}, new long[] {0, 0, 1, 2, 5, 12, 28, 70});
  }
}
