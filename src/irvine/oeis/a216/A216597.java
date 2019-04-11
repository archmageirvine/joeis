package irvine.oeis.a216;

import irvine.oeis.LinearRecurrence;

/**
 * A216597 <code>a(n) = 13*a(n-1) - 65*a(n-2) + 156*a(n-3) - 182*a(n-4) + 91*a(n-5) - 13*a(n-6)</code>.
 * @author Sean A. Irvine
 */
public class A216597 extends LinearRecurrence {

  /** Construct the sequence. */
  public A216597() {
    super(new long[] {-13, 91, -182, 156, -65, 13}, new long[] {0, -1, -5, -22, -91, -364});
  }
}
