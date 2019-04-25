package irvine.oeis.a247;

import irvine.oeis.LinearRecurrence;

/**
 * A247614 <code>a(n) = Sum_{k=0..9} binomial(18,k)*binomial(n,k)</code>.
 * @author Sean A. Irvine
 */
public class A247614 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247614() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {1, 19, 190, 1330, 7315, 33649, 134596, 480700, 1562275, 4686825});
  }
}
