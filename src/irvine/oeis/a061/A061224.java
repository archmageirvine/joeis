package irvine.oeis.a061;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A061224 a(n) = n^2 + (n + 1)^3 + (n + 2)^4 + (n + 3)^5.
 * @author Sean A. Irvine
 */
public class A061224 extends LinearRecurrence {

  /** Construct the sequence. */
  public A061224() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {260, 1114, 3412, 8474, 18244, 35410});
  }
}
