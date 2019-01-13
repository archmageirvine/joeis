package irvine.oeis.a007;

import irvine.oeis.LinearRecurrence;

/**
 * A007481.
 * @author Sean A. Irvine
 */
public class A007481 extends LinearRecurrence {

  /** Construct the sequence. */
  public A007481() {
    super(new long[] {2, 0, 3, 0}, new long[] {1, 2, 3, 7});
  }
}

