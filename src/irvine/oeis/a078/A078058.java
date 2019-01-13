package irvine.oeis.a078;

import irvine.oeis.LinearRecurrence;

/**
 * A078058.
 * @author Sean A. Irvine
 */
public class A078058 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078058() {
    super(new long[] {-1, 1, -2}, new long[] {1, -3, 7});
  }
}
