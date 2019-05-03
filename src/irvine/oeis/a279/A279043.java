package irvine.oeis.a279;

import irvine.oeis.LinearRecurrence;

/**
 * A279043 Numbers k such that <code>3*k+1</code> and <code>4*k+1</code> are both triangular numbers <code>(A000217)</code>.
 * @author Sean A. Irvine
 */
public class A279043 extends LinearRecurrence {

  /** Construct the sequence. */
  public A279043() {
    super(new long[] {1, -195, 195}, new long[] {63, 12285, 2383290});
  }
}
