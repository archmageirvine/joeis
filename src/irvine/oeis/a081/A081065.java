package irvine.oeis.a081;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A081065 Numbers n such that n^2 = (1/3)*(n+floor(sqrt(3)*n*floor(sqrt(3)*n))).
 * @author Sean A. Irvine
 */
public class A081065 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081065() {
    super(1, new long[] {1, -15, 15}, new long[] {2, 24, 330});
  }
}
