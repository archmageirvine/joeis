package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195878.
 * @author Sean A. Irvine
 */
public class A195878 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195878() {
    super(new long[] {-1, 0, 16, 0}, new long[] {1, 13, 29, 209});
  }
}
