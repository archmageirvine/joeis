package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037673.
 * @author Sean A. Irvine
 */
public class A037673 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037673() {
    super(new long[] {-10, 1, 0, 10}, new long[] {3, 32, 320, 3203});
  }
}
