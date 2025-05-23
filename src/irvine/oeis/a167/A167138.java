package irvine.oeis.a167;
// Generated by gen_seq4.pl 2024-11-22.ack/lambdan at 2024-11-22 22:47

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;

/**
 * A167138 G.f.: Sum_{n&gt;=0} A167137(n)^2 * log(1+x)^n/n! where Sum_{n&gt;=0} A167137(n)*log(1+x)^n/n! = g.f. of the partition numbers (A000041).
 * @author Georg Fischer
 */
public class A167138 extends LambdaSequence {

  private static final DirectSequence A167137 = new A167137();

  /** Construct the sequence. */
  public A167138() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> Functions.STIRLING1.z(n, k).multiply(A167137.a(k).square())).divide(Functions.FACTORIAL.z(n)));
  }
}
