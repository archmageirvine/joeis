package irvine.oeis.a144;

import irvine.oeis.LinearRecurrence;

/**
 * A144437 Period 3: repeat <code>[3, 3, 1]</code>.
 * @author Sean A. Irvine
 */
public class A144437 extends LinearRecurrence {

  /** Construct the sequence. */
  public A144437() {
    super(new long[] {1, 0, 0}, new long[] {3, 3, 1});
  }
}
