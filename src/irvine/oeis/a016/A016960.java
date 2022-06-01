package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016960 a(n) = (6*n + 4)^4.
 * @author Sean A. Irvine
 */
public class A016960 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016960() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {256, 10000, 65536, 234256, 614656});
  }
}
