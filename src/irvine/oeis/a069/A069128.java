package irvine.oeis.a069;

import irvine.oeis.LinearRecurrence;

/**
 * A069128 Centered 15-gonal numbers: <code>a(n) = (15*n^2 - 15*n + 2)/2</code>.
 * @author Sean A. Irvine
 */
public class A069128 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069128() {
    super(new long[] {1, -3, 3}, new long[] {1, 16, 46});
  }
}
