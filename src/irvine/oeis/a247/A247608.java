package irvine.oeis.a247;

import irvine.oeis.LinearRecurrence;

/**
 * A247608 <code>a(n) =</code> Sum_{k=0..3} binomial(6,k)*binomial(n,k).
 * @author Sean A. Irvine
 */
public class A247608 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247608() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 7, 28, 84});
  }
}
