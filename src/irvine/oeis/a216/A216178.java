package irvine.oeis.a216;

import irvine.oeis.LinearRecurrence;

/**
 * A216178.
 * @author Sean A. Irvine
 */
public class A216178 extends LinearRecurrence {

  /** Construct the sequence. */
  public A216178() {
    super(new long[] {1, 0, 0, 0}, new long[] {4, 1, 0, -3});
  }
}
