package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017163 <code>a(n) = (9*n)^3</code>.
 * @author Sean A. Irvine
 */
public class A017163 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017163() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 729, 5832, 19683});
  }
}
