package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022967 <code>11-n</code>.
 * @author Sean A. Irvine
 */
public class A022967 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022967() {
    super(new long[] {-1, 2}, new long[] {11, 10});
  }
}
