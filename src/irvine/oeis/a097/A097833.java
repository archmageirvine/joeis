package irvine.oeis.a097;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A097833 Partial sums of Chebyshev sequence S(n,20)= U(n,10)=A075843(n+1).
 * @author Sean A. Irvine
 */
public class A097833 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097833() {
    super(new long[] {1, -21, 21}, new long[] {1, 21, 420});
  }
}
