package irvine.oeis.a053;

import irvine.oeis.LinearRecurrence;

/**
 * A053154.
 * @author Sean A. Irvine
 */
public class A053154 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053154() {
    super(new long[] {-24, 50, -35, 10}, new long[] {0, 1, 5, 22});
  }
}
