package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041114 Numerators of continued fraction convergents to <code>sqrt(66)</code>.
 * @author Sean A. Irvine
 */
public class A041114 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041114() {
    super(new long[] {-1, 0, 130, 0}, new long[] {8, 65, 1048, 8449});
  }
}
