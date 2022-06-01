package irvine.oeis.a265;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A265423 (-1)^n + 50*floor(3n/2) - 100*floor(n/4).
 * @author Sean A. Irvine
 */
public class A265423 extends LinearRecurrence {

  /** Construct the sequence. */
  public A265423() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {1, 49, 151, 199, 201});
  }
}
