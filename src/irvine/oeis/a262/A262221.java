package irvine.oeis.a262;

import irvine.oeis.LinearRecurrence;

/**
 * A262221 <code>a(n) = 25*n*(n + 1)/2 + 1</code>.
 * @author Sean A. Irvine
 */
public class A262221 extends LinearRecurrence {

  /** Construct the sequence. */
  public A262221() {
    super(new long[] {1, -3, 3}, new long[] {1, 26, 76});
  }
}
