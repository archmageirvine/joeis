package irvine.oeis.a053;

import irvine.oeis.LinearRecurrence;

/**
 * A053439.
 * @author Sean A. Irvine
 */
public class A053439 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053439() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {1, 2, 4, 8, 11});
  }
}
