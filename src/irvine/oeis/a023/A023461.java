package irvine.oeis.a023;

import irvine.oeis.LinearRecurrence;

/**
 * A023461 n-19.
 * @author Sean A. Irvine
 */
public class A023461 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023461() {
    super(new long[] {-1, 2}, new long[] {-19, -18});
  }
}
