package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291735.
 * @author Sean A. Irvine
 */
public class A291735 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291735() {
    super(new long[] {1, 0, 3, 0, 3, 0, 2, 0, 1}, new long[] {1, 1, 3, 5, 10, 19, 35, 67, 124});
  }
}
