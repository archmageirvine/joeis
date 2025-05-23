package irvine.oeis.a381;
// Generated by gen_seq4.pl 2025-02-26.ack/lambdan at 2025-02-26 21:21

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.math.zi.Zi;
import irvine.oeis.LambdaSequence;

/**
 * A381384 E.g.f. A(x) satisfies A(x) = 1/( 1 - sin(x * A(x)^2) / A(x)^2 ).
 * @author Georg Fischer
 */
public class A381384 extends LambdaSequence {

  /** Construct the sequence. */
  public A381384() {
    super(0, n -> Rationals.SINGLETON.sum(0, n, k -> new Q(Functions.FACTORIAL.z(k).multiply(Binomial.binomial(2L * n - k + 1, k)), Z.valueOf(2L * n - k + 1)).multiply(new Zi(0, 1).pow(n - k).re()).multiply(Integers.SINGLETON.sum(0, k, j -> Z.NEG_ONE.pow(k - j).multiply(Z.valueOf(2L * j - k).pow(n)).multiply(Binomial.binomial(k, j))).divide(Z.TWO.pow(k).multiply(Functions.FACTORIAL.z(k))))).num());
  }
}
