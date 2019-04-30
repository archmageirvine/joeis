package irvine.oeis.a162;

import irvine.oeis.LinearRecurrence;

/**
 * A162485 <code>a(1) = 4, a(2) = 6; a(n) = 2 a(n - 1) + a(n - 2) - 4</code> Mod[n <code>- 1</code>, 2].
 * @author Sean A. Irvine
 */
public class A162485 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162485() {
    super(new long[] {-1, -2, 2, 2}, new long[] {4, 6, 16, 34});
  }
}
