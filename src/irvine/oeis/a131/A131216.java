package irvine.oeis.a131;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A131216 Numbers X such that 99*X^2 - 2178 is a square.
 * @author Sean A. Irvine
 */
public class A131216 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131216() {
    super(new long[] {-1, 20}, new long[] {11, 209});
  }
}
