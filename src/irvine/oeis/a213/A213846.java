package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213846.
 * @author Sean A. Irvine
 */
public class A213846 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213846() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {3, 23, 90, 250, 565});
  }
}
