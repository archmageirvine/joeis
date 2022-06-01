package irvine.oeis.a281;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A281500 Reduced denominators of f(n) = (n+1)/(2^(2+n)-2) with A026741(n+1) as numerators.
 * @author Sean A. Irvine
 */
public class A281500 extends LinearRecurrence {

  /** Construct the sequence. */
  public A281500() {
    super(new long[] {-4, 0, 5, 0}, new long[] {2, 3, 14, 15});
  }
}
