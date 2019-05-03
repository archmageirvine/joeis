package irvine.oeis.a265;

import irvine.oeis.LinearRecurrence;

/**
 * A265188 Nonnegative m for which <code>3*floor(m^2/11) = floor(3*m^2/11)</code>.
 * @author Sean A. Irvine
 */
public class A265188 extends LinearRecurrence {

  /** Construct the sequence. */
  public A265188() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {0, 1, 5, 6, 10, 11});
  }
}
