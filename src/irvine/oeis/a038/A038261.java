package irvine.oeis.a038;

import irvine.oeis.LinearRecurrence;

/**
 * A038261.
 * @author Sean A. Irvine
 */
public class A038261 extends LinearRecurrence {

  /** Construct the sequence. */
  public A038261() {
    super(new long[] {1, -9, 28, -35, 15}, new long[] {1, 5, 55, 671, 8272});
  }
}
