package irvine.oeis.a174;
// Generated by ./gen_seq4.pl /partsum at 2022-06-25 09:09

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a062.A062758;

/**
 * A174939 a(n) = Sum_{k&lt;=n} A007955(k) * A007955(k) = Sum_{k&lt;=n} A007955(k)^2, where A007955(m) = product of divisors of m.
 * @author Sean A. Irvine
 */
public class A174939 extends PartialSumSequence {

  /** Construct the sequence. */
  public A174939() {
    super(1, new A062758());
  }
}
