package irvine.oeis.a078;

import irvine.oeis.LinearRecurrence;

/**
 * A078126 Negative determinant of <code>n X n</code> matrix <code>M_{i,j}=1</code> if <code>i=j</code> or <code>i+j=1 (mod 2)</code>.
 * @author Sean A. Irvine
 */
public class A078126 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078126() {
    super(new long[] {1, -2, 0, 2}, new long[] {-1, -1, 0, 1});
  }
}
