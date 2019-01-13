package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021104.
 * @author Sean A. Irvine
 */
public class A021104 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021104() {
    super(new long[] {-96, 176, -98, 19}, new long[] {1, 19, 263, 3311});
  }
}
