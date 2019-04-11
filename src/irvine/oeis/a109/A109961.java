package irvine.oeis.a109;

import irvine.oeis.LinearRecurrence;

/**
 * A109961 Expansion of <code>(1-x)^3/(1-4x+5x^2-4x^3+x^4)</code>.
 * @author Sean A. Irvine
 */
public class A109961 extends LinearRecurrence {

  /** Construct the sequence. */
  public A109961() {
    super(new long[] {-1, 4, -5, 4}, new long[] {1, 1, 2, 6});
  }
}
