package irvine.oeis.a079;

import irvine.oeis.LinearRecurrence;

/**
 * A079027 a(n)=det(M(n)) where M(n) is the n X n matrix defined by m(i,i)=6, m(i,j)=i/j.
 * @author Sean A. Irvine
 */
public class A079027 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079027() {
    super(new long[] {-25, 10}, new long[] {6, 35});
  }
}
