package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157509 <code>a(n) = 13122*n^2 - 324*n + 1</code>.
 * @author Sean A. Irvine
 */
public class A157509 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157509() {
    super(new long[] {1, -3, 3}, new long[] {12799, 51841, 117127});
  }
}
