package irvine.oeis.a277;

import irvine.oeis.LinearRecurrence;

/**
 * A277979 <code>a(n) = 4*n^2 + 18*n</code>.
 * @author Sean A. Irvine
 */
public class A277979 extends LinearRecurrence {

  /** Construct the sequence. */
  public A277979() {
    super(new long[] {1, -3, 3}, new long[] {0, 22, 52});
  }
}
