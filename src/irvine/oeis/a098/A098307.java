package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098307.
 * @author Sean A. Irvine
 */
public class A098307 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098307() {
    super(new long[] {-1, 8, 8}, new long[] {0, 1, 7});
  }
}
