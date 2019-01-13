package irvine.oeis.a012;

import irvine.oeis.LinearRecurrence;

/**
 * A012781.
 * @author Sean A. Irvine
 */
public class A012781 extends LinearRecurrence {

  /** Construct the sequence. */
  public A012781() {
    super(new long[] {1, -4, 5}, new long[] {0, 1, 4});
  }
}
