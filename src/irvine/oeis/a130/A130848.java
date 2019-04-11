package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130848 Periodic sequence with period <code>(2, 5, 3, -2, -5, -3)</code>.
 * @author Sean A. Irvine
 */
public class A130848 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130848() {
    super(new long[] {-1, 1}, new long[] {2, 5});
  }
}
