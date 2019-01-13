package irvine.oeis.a216;

import irvine.oeis.LinearRecurrence;

/**
 * A216107.
 * @author Sean A. Irvine
 */
public class A216107 extends LinearRecurrence {

  /** Construct the sequence. */
  public A216107() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {168, 1720, 6636, 17796, 38980});
  }
}
