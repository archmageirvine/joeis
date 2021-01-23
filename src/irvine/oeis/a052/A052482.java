package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052482 a(n) = 2^(n-2)*binomial(n+1,2).
 * @author Sean A. Irvine
 */
public class A052482 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052482() {
    super(new long[] {8, -12, 6}, new long[] {3, 12, 40});
  }
}
