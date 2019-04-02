package irvine.oeis.a080;

import irvine.oeis.LinearRecurrence;

/**
 * A080260 a(n)=1+(1/12)(n*(n+1)*(n+3)*(4-n)).
 * @author Sean A. Irvine
 */
public class A080260 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080260() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 3, 6, 7, 1});
  }
}
