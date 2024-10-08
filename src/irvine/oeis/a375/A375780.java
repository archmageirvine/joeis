package irvine.oeis.a375;
// Generated by gen_seq4.pl 2024-10-08.ack/lambdan at 2024-10-08 23:52

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A375780 a(n) = Sum_{k=0..n} binomial(n,k) * (k! * S(n,k))^2, where S(,) are Stirling numbers of second kind.
 * @author Georg Fischer
 */
public class A375780 extends LambdaSequence {

  /** Construct the sequence. */
  public A375780() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> Binomial.binomial(n, k).multiply(Functions.FACTORIAL.z(k).multiply(Functions.STIRLING2.z(n, k)).square())));
  }
}
