package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041552 Numerators of continued fraction convergents to <code>sqrt(294)</code>.
 * @author Sean A. Irvine
 */
public class A041552 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041552() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 9602, 0, 0, 0, 0, 0}, new long[] {17, 103, 120, 583, 703, 4801, 163937, 988423, 1152360, 5597863, 6750223, 46099201});
  }
}
