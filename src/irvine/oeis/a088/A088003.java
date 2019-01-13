package irvine.oeis.a088;

import irvine.oeis.LinearRecurrence;

/**
 * A088003.
 * @author Sean A. Irvine
 */
public class A088003 extends LinearRecurrence {

  /** Construct the sequence. */
  public A088003() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {1, 4, 11, 22, 40, 64});
  }
}
