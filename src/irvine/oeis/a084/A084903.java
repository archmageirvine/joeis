package irvine.oeis.a084;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A084903 Binomial transform of positive cubes.
 * @author Sean A. Irvine
 */
public class A084903 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084903() {
    super(new long[] {-16, 32, -24, 8}, new long[] {1, 9, 44, 170});
  }
}
