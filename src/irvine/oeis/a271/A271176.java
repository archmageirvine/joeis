package irvine.oeis.a271;

import irvine.oeis.LinearRecurrence;

/**
 * A271176.
 * @author Sean A. Irvine
 */
public class A271176 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271176() {
    super(new long[] {-2, 5, -8, 5}, new long[] {1, 1, 4, 13});
  }
}
