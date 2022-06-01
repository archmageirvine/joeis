package irvine.oeis.a059;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A059945 Number of 4-block bicoverings of an n-set.
 * @author Sean A. Irvine
 */
public class A059945 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059945() {
    super(new long[] {-36, 72, -47, 12}, new long[] {0, 0, 4, 39});
  }
}
