package irvine.oeis.a219;

import irvine.oeis.LinearRecurrence;

/**
 * A219085 Floor((n <code>+ 1/2)^3)</code>.
 * @author Sean A. Irvine
 */
public class A219085 extends LinearRecurrence {

  /** Construct the sequence. */
  public A219085() {
    super(new long[] {-1, 3, -3, 1, 1, -3, 3}, new long[] {0, 3, 15, 42, 91, 166, 274});
  }
}
