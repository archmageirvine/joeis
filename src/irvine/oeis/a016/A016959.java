package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016959 a(n) = (6*n + 4)^3.
 * @author Sean A. Irvine
 */
public class A016959 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016959() {
    super(new long[] {-1, 4, -6, 4}, new long[] {64, 1000, 4096, 10648});
  }
}
