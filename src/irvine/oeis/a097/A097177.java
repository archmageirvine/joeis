package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097177 <code>a(n) = Sum_{k=0..n} binomial(floor((n+1)/2), floor((k+1)/2)) * 10^k</code>.
 * @author Sean A. Irvine
 */
public class A097177 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097177() {
    super(new long[] {10100, -10100, -201, 201, 1}, new long[] {1, 11, 111, 1221, 11221});
  }
}
