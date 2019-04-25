package irvine.oeis.a247;

import irvine.oeis.LinearRecurrence;

/**
 * A247615 <code>a(n) = Sum_{k=0..10} binomial(20,k)*binomial(n,k)</code>.
 * @author Sean A. Irvine
 */
public class A247615 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247615() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {1, 21, 231, 1771, 10626, 53130, 230230, 888030, 3108105, 10015005, 30045015});
  }
}
