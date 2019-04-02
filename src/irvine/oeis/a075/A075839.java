package irvine.oeis.a075;

import irvine.oeis.LinearRecurrence;

/**
 * A075839 11*n^2 - 2 is a square.
 * @author Sean A. Irvine
 */
public class A075839 extends LinearRecurrence {

  /** Construct the sequence. */
  public A075839() {
    super(new long[] {-1, 20}, new long[] {1, 19});
  }
}
