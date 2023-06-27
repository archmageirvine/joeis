package irvine.oeis.a151;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A151961 Semiperimeter of the n-th Heronian triangle.
 * @author Sean A. Irvine
 */
public class A151961 extends LinearRecurrence {

  /** Construct the sequence. */
  public A151961() {
    super(1, new long[] {-1, 4}, new long[] {3, 6});
  }
}
