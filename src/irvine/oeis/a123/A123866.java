package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123866 a(n) = n^6 - 1.
 * @author Sean A. Irvine
 */
public class A123866 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123866() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 63, 728, 4095, 15624, 46655, 117648});
  }
}
