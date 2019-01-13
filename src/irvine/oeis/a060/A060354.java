package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060354.
 * @author Sean A. Irvine
 */
public class A060354 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060354() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 1, 2, 6});
  }
}
