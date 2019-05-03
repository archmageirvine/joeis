package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051587 Number of <code>4 X n</code> binary matrices such that any 2 rows have a common 1.
 * @author Sean A. Irvine
 */
public class A051587 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051587() {
    super(new long[] {-29030400, 28782720, -12279888, 2944132, -433744, 40195, -2287, 73}, new long[] {0, 1, 31, 781, 17887, 380821, 7635991, 145858861});
  }
}
