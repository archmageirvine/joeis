package irvine.oeis.a264;

import irvine.oeis.LinearRecurrence;

/**
 * A264445.
 * @author Sean A. Irvine
 */
public class A264445 extends LinearRecurrence {

  /** Construct the sequence. */
  public A264445() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 46, 104, 175});
  }
}
