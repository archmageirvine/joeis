package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037653.
 * @author Sean A. Irvine
 */
public class A037653 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037653() {
    super(new long[] {-4, 1, 0, 4}, new long[] {3, 12, 50, 203});
  }
}
