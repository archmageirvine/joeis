package irvine.oeis.a096;
// Generated by gen_seq4.pl 2025-03-25.ack/lambmin1k at 2025-03-26 22:32

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.LeastLambdaSequence;

/**
 * A096937 Least k such that k*P(n)#/2 - 2 and k*P(n)#/2 + 2 are both primes, where P(i)= i-th prime, P(i)# = i-th primorial.
 * @author Georg Fischer
 */
public class A096937 extends LeastLambdaSequence {

  /** Construct the sequence. */
  public A096937() {
    super(1, (n, k) -> {
      final Z pmn = Functions.PRIMORIAL.z(Functions.PRIME.i(n)).multiply(k).divide(2);
      return Predicates.PRIME.is(pmn.subtract(2)) && Predicates.PRIME.is(pmn.add(2));
    }, 1, ONE);
  }
}
