package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041218 Numerators of continued fraction convergents to <code>sqrt(120)</code>.
 * @author Sean A. Irvine
 */
public class A041218 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041218() {
    super(new long[] {-1, 0, 22, 0}, new long[] {10, 11, 230, 241});
  }
}
