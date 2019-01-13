package irvine.oeis.a124;

import irvine.oeis.LinearRecurrence;

/**
 * A124024.
 * @author Sean A. Irvine
 */
public class A124024 extends LinearRecurrence {

  /** Construct the sequence. */
  public A124024() {
    super(new long[] {-5, 10, 9, -2}, new long[] {1, -2, 13, -34});
  }
}
