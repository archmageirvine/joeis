package irvine.oeis.a023;

import irvine.oeis.LinearRecurrence;

/**
 * A023449 n-7.
 * @author Sean A. Irvine
 */
public class A023449 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023449() {
    super(new long[] {-1, 2}, new long[] {-7, -6});
  }
}
