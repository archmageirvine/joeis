package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131465 <code>a(n)=4n^4-3n^3+2n^2-n+1</code>.
 * @author Sean A. Irvine
 */
public class A131465 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131465() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 3, 47, 259, 861});
  }
}
