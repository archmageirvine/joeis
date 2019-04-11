package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041186 Numerators of continued fraction convergents to <code>sqrt(104)</code>.
 * @author Sean A. Irvine
 */
public class A041186 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041186() {
    super(new long[] {-1, 0, 102, 0}, new long[] {10, 51, 1030, 5201});
  }
}
