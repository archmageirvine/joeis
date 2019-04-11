package irvine.oeis.a069;

import irvine.oeis.LinearRecurrence;

/**
 * A069130 Centered 17-gonal numbers: <code>(17*n^2 - 17*n + 2)/2</code>.
 * @author Sean A. Irvine
 */
public class A069130 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069130() {
    super(new long[] {1, -3, 3}, new long[] {1, 18, 52});
  }
}
