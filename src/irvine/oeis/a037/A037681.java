package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037681.
 * @author Sean A. Irvine
 */
public class A037681 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037681() {
    super(new long[] {-4, 1, 0, 0, 4}, new long[] {1, 4, 19, 78, 313});
  }
}
