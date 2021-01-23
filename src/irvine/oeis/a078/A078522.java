package irvine.oeis.a078;

import irvine.oeis.LinearRecurrence;

/**
 * A078522 Numbers n such that (n+1)*(2*n+1) is a perfect square.
 * @author Sean A. Irvine
 */
public class A078522 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078522() {
    super(new long[] {1, -35, 35}, new long[] {0, 24, 840});
  }
}
