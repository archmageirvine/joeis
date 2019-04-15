package irvine.oeis.a247;

import irvine.oeis.LinearRecurrence;

/**
 * A247611 <code>a(n) =</code> Sum{k=0..6} <code>binomial(12,k)*binomial(n,k)</code>.
 * @author Sean A. Irvine
 */
public class A247611 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247611() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 13, 91, 455, 1820, 6188, 18564});
  }
}
