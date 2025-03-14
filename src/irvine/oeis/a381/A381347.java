package irvine.oeis.a381;
// Generated by gen_seq4.pl 2025-02-26.ack/lambdan at 2025-02-26 21:21

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A381347 Expansion of e.g.f. 1/( 1 - sin(sqrt(2)*x) / sqrt(2) ).
 * @author Georg Fischer
 */
public class A381347 extends LambdaSequence {

  /** Construct the sequence. */
  public A381347() {
    super(0, n -> (n == 0) ? Z.ONE : Integers.SINGLETON.sum(0, n, k -> Functions.FACTORIAL.z(k).multiply(Z.valueOf(-2).pow((n - k) / 2)).multiply(Integers.SINGLETON.sum(0, k, j -> Z.NEG_ONE.pow(k - j).multiply(Z.valueOf(2L * j - k).pow(n)).multiply(Binomial.binomial(k, j))).divide(Z.TWO.pow(k).multiply(Functions.FACTORIAL.z(k))))));
  }
}
