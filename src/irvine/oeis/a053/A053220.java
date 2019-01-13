package irvine.oeis.a053;

import irvine.oeis.LinearRecurrence;

/**
 * A053220.
 * @author Sean A. Irvine
 */
public class A053220 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053220() {
    super(new long[] {-4, 4}, new long[] {1, 5});
  }
}
