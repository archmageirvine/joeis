package irvine.oeis.a059;

import irvine.oeis.LinearRecurrence;

/**
 * A059270 Numbers which are both the sum of n+1 consecutive integers and the sum of the n immediately higher consecutive integers.
 * @author Sean A. Irvine
 */
public class A059270 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059270() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 3, 15, 42});
  }
}
