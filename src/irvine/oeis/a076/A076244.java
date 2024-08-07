package irvine.oeis.a076;
// Generated by gen_seq4.pl 2024-07-16/distinct at 2024-07-16 22:37

import irvine.oeis.DistinctSequence;
import irvine.oeis.a051.A051547;

/**
 * A076244 Distinct values arising in A051547, sequence of a(n) = lcm(phi(1), ..., phi(n)).
 * @author Georg Fischer
 */
public class A076244 extends DistinctSequence {

  /** Construct the sequence. */
  public A076244() {
    super(1, new A051547());
  }
}
