package irvine.oeis.a063;

import irvine.oeis.LinearRecurrence;

/**
 * A063213.
 * @author Sean A. Irvine
 */
public class A063213 extends LinearRecurrence {

  /** Construct the sequence. */
  public A063213() {
    super(new long[] {-1, 1, 0, 1}, new long[] {1, 5, 9, 11});
  }
}
