package irvine.oeis.a222;

import irvine.oeis.LinearRecurrence;

/**
 * A222591.
 * @author Sean A. Irvine
 */
public class A222591 extends LinearRecurrence {

  /** Construct the sequence. */
  public A222591() {
    super(new long[] {1, 0, 0, -3, 0, 0, 3, 0, 0}, new long[] {1, 5, 8, 4, 17, 23, 10, 38, 47});
  }
}
