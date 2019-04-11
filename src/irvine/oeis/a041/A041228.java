package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041228 Numerators of continued fraction convergents to <code>sqrt(126)</code>.
 * @author Sean A. Irvine
 */
public class A041228 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041228() {
    super(new long[] {-1, 0, 0, 0, 898, 0, 0, 0}, new long[] {11, 45, 101, 449, 9979, 40365, 90709, 403201});
  }
}
