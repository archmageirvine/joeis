package irvine.oeis.a373;
// Generated by gen_seq4.pl 2024-07-21/lambdan at 2024-07-22 00:06

import irvine.math.function.Functions;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a064.A064097;

/**
 * A373370 a(n) = gcd(bigomega(n), A064097(n)), where bigomega is number of prime factors with repetition, and A064097 is a quasi-logarithm defined inductively by a(1) = 0 and a(p) = 1 + a(p-1) if p is prime and a(n*m) = a(n) + a(m) if m,n &gt; 1.
 * @author Georg Fischer
 */
public class A373370 extends LambdaSequence {

  private static final DirectSequence A064097 = new A064097();

  /** Construct the sequence. */
  public A373370() {
    super(1, n -> Functions.GCD.z(Functions.BIG_OMEGA.z(n), A064097.a(n)));
  }
}
