package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037699.
 * @author Sean A. Irvine
 */
public class A037699 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037699() {
    super(new long[] {-8, 1, 0, 0, 8}, new long[] {1, 10, 83, 664, 5313});
  }
}
