package irvine.oeis.a242;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A242477 a(n) = floor(3*n^2/4).
 * @author Sean A. Irvine
 */
public class A242477 extends LinearRecurrence {

  /** Construct the sequence. */
  public A242477() {
    super(new long[] {1, -2, 0, 2}, new long[] {0, 0, 3, 6});
  }
}
