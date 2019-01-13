package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037682.
 * @author Sean A. Irvine
 */
public class A037682 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037682() {
    super(new long[] {-5, 1, 0, 0, 5}, new long[] {1, 5, 28, 142, 711});
  }
}
