package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084684.
 * @author Sean A. Irvine
 */
public class A084684 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084684() {
    super(new long[] {1, -2, 0, 2}, new long[] {1, 2, 4, 8});
  }
}
