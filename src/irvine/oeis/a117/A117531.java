package irvine.oeis.a117;
// Generated by gen_seq4.pl 2025-06-16.ack/lambdan at 2025-06-16 21:55

import irvine.math.z.Integers;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a010.A010051;
import irvine.oeis.triangle.DirectArray;

/**
 * A117531 Number of primes in the n-th row of the triangle in A117530.
 * @author Georg Fischer
 */
public class A117531 extends LambdaSequence {

  private static final DirectSequence A010051 = new A010051();
  private static final DirectArray A117530 = new A117530();

  /** Construct the sequence. */
  public A117531() {
    super(1, n -> Integers.SINGLETON.sum(1, n, k -> A010051.a(A117530.a(n, k))));
  }
}
