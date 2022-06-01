package irvine.oeis.a253;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A253707 Numbers M(n) which are the number of terms in the sums of consecutive cubed integers equaling a squared integer, b^3 + (b+1)^3 + ... + (b+M-1)^3 = c^2, for a first term b(n) being an odd squared integer (A016754).
 * @author Sean A. Irvine
 */
public class A253707 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253707() {
    super(new long[] {-1, 4, -6, 4}, new long[] {17, 98, 291, 644});
  }
}
