package irvine.oeis.a181;

import irvine.oeis.LinearRecurrence;

/**
 * A181342.
 * @author Sean A. Irvine
 */
public class A181342 extends LinearRecurrence {

  /** Construct the sequence. */
  public A181342() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 26, 186, 726, 2031});
  }
}
