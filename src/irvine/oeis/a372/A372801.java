package irvine.oeis.a372;
// Generated by gen_seq4.pl 2025-02-03.ack/sintrif at 2025-02-03 18:14

import irvine.math.function.Functions;
import irvine.oeis.a082.A082654;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A372801 Order of 16 modulo the n-th prime: least k such that prime(n) divides 16^k-1.
 * @author Georg Fischer
 */
public class A372801 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A372801() {
    super(2, (term, n) -> term.divide(Functions.GCD.z(2, term)), "", new A082654());
  }
}
