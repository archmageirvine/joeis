package irvine.oeis.a069;

import irvine.oeis.LinearRecurrence;

/**
 * A069984 1123+21460n.
 * @author Sean A. Irvine
 */
public class A069984 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069984() {
    super(new long[] {-1, 2}, new long[] {1123, 22583});
  }
}
