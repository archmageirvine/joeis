package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131216 Numbers X such that <code>99*X^2-2178</code> is a square.
 * @author Sean A. Irvine
 */
public class A131216 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131216() {
    super(new long[] {-1, 20}, new long[] {11, 209});
  }
}
