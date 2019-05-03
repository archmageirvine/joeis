package irvine.oeis.a079;

import irvine.oeis.LinearRecurrence;

/**
 * A079034 Determinant of <code>M(n)</code>, the <code>n X n</code> matrix defined by <code>m(i,i)=1, m(i,j)=i-j</code>.
 * @author Sean A. Irvine
 */
public class A079034 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079034() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 2, 7, 21, 51});
  }
}
