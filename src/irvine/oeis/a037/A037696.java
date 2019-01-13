package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037696.
 * @author Sean A. Irvine
 */
public class A037696 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037696() {
    super(new long[] {-5, 1, 0, 0, 5}, new long[] {1, 7, 38, 190, 951});
  }
}
