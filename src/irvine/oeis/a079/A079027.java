package irvine.oeis.a079;

import irvine.oeis.LinearRecurrence;

/**
 * A079027 <code>a(n)=det(M(n))</code> where <code>M(n)</code> is the <code>n X n</code> matrix defined by <code>m(i,i)=6, m(i,j)=i/j</code>.
 * @author Sean A. Irvine
 */
public class A079027 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079027() {
    super(new long[] {-25, 10}, new long[] {6, 35});
  }
}
