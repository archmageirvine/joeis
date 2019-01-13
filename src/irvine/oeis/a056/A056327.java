package irvine.oeis.a056;

import irvine.oeis.LinearRecurrence;

/**
 * A056327.
 * @author Sean A. Irvine
 */
public class A056327 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056327() {
    super(new long[] {36, -66, 6, 49, -24, -6, 6}, new long[] {0, 0, 1, 4, 15, 50, 160});
  }
}
