package irvine.oeis.a188;

import irvine.oeis.LinearRecurrence;

/**
 * A188167 a(2+4*n)=1+2*n, otherwise a(n)=2*n.
 * @author Sean A. Irvine
 */
public class A188167 extends LinearRecurrence {

  /** Construct the sequence. */
  public A188167() {
    super(new long[] {-1, 0, 0, 0, 2, 0, 0, 0}, new long[] {0, 2, 1, 6, 8, 10, 3, 14});
  }
}
