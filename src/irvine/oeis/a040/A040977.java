package irvine.oeis.a040;

import irvine.oeis.LinearRecurrence;

/**
 * A040977.
 * @author Sean A. Irvine
 */
public class A040977 extends LinearRecurrence {

  /** Construct the sequence. */
  public A040977() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 8, 35, 112, 294, 672, 1386});
  }
}
