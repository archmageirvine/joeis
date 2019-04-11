package irvine.oeis.a279;

import irvine.oeis.LinearRecurrence;

/**
 * A279895 <code>a(n) = n*(5*n + 11)/2</code>.
 * @author Sean A. Irvine
 */
public class A279895 extends LinearRecurrence {

  /** Construct the sequence. */
  public A279895() {
    super(new long[] {1, -3, 3}, new long[] {0, 8, 21});
  }
}
