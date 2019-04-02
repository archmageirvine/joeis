package irvine.oeis.a023;

import irvine.oeis.LinearRecurrence;

/**
 * A023462 n-20.
 * @author Sean A. Irvine
 */
public class A023462 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023462() {
    super(new long[] {-1, 2}, new long[] {-20, -19});
  }
}
