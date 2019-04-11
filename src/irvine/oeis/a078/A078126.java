package irvine.oeis.a078;

import irvine.oeis.LinearRecurrence;

/**
 * A078126 Negative determinant of n X n matrix M_{i,j}=1 if i=j or i+j=1 <code>(mod 2)</code>.
 * @author Sean A. Irvine
 */
public class A078126 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078126() {
    super(new long[] {1, -2, 0, 2}, new long[] {-1, -1, 0, 1});
  }
}
