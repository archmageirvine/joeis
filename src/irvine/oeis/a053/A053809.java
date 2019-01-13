package irvine.oeis.a053;

import irvine.oeis.LinearRecurrence;

/**
 * A053809.
 * @author Sean A. Irvine
 */
public class A053809 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053809() {
    super(new long[] {1, -3, 1, 6, -9, 5}, new long[] {1, 6, 21, 57, 133, 281});
  }
}
