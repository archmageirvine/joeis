package irvine.oeis.a249;

import irvine.oeis.LinearRecurrence;

/**
 * A249863 Chebyshev S polynomial <code>(A049310)</code> evaluated at <code>x = 26/7</code> and multiplied by powers of <code>7 (A000420)</code>.
 * @author Sean A. Irvine
 */
public class A249863 extends LinearRecurrence {

  /** Construct the sequence. */
  public A249863() {
    super(new long[] {-49, 26}, new long[] {1, 26});
  }
}
