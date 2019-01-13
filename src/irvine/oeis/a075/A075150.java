package irvine.oeis.a075;

import irvine.oeis.LinearRecurrence;

/**
 * A075150.
 * @author Sean A. Irvine
 */
public class A075150 extends LinearRecurrence {

  /** Construct the sequence. */
  public A075150() {
    super(new long[] {1, 2, -2}, new long[] {4, -1, 9});
  }
}
