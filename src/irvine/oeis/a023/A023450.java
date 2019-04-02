package irvine.oeis.a023;

import irvine.oeis.LinearRecurrence;

/**
 * A023450 n-8.
 * @author Sean A. Irvine
 */
public class A023450 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023450() {
    super(new long[] {-1, 2}, new long[] {-8, -7});
  }
}
