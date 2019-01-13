package irvine.oeis.a138;

import irvine.oeis.LinearRecurrence;

/**
 * A138380.
 * @author Sean A. Irvine
 */
public class A138380 extends LinearRecurrence {

  /** Construct the sequence. */
  public A138380() {
    super(new long[] {-4, 0, 0, 0}, new long[] {1, 2, -1, -2});
  }
}
