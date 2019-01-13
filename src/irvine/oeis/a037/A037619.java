package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037619.
 * @author Sean A. Irvine
 */
public class A037619 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037619() {
    super(new long[] {-5, 1, 0, 5}, new long[] {2, 10, 53, 267});
  }
}
