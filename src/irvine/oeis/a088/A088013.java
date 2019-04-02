package irvine.oeis.a088;

import irvine.oeis.LinearRecurrence;

/**
 * A088013 Binomial transform of A001541 (with interpolated zeros).
 * @author Sean A. Irvine
 */
public class A088013 extends LinearRecurrence {

  /** Construct the sequence. */
  public A088013() {
    super(new long[] {4, -8, 0, 4}, new long[] {1, 1, 4, 10});
  }
}
