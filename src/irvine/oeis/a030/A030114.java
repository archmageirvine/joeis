package irvine.oeis.a030;

import irvine.oeis.LinearRecurrence;

/**
 * A030114.
 * @author Sean A. Irvine
 */
public class A030114 extends LinearRecurrence {

  /** Construct the sequence. */
  public A030114() {
    super(new long[] {1, 1, -9, -8, 28, 21, -35, -20, 15, 5}, new long[] {1, 10, 55, 385, 2530, 17017, 113641, 760804, 5089282, 34053437});
  }
}
