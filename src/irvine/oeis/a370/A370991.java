package irvine.oeis.a370;
// Generated by gen_seq4.pl 2024-03-08/lambdan at 2024-03-10 23:05

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A370991 Expansion of e.g.f. (1/x) * Series_Reversion( x*(1 - x^2/2*(exp(x) - 1)) ).
 * @author Georg Fischer
 */
public class A370991 extends LambdaSequence {

  /** Construct the sequence. */
  public A370991() {
    super(0, n -> Rationals.SINGLETON.sum(0, n / 3, k -> new Q(Functions.STIRLING2.z(n - 2L * k, k), Z.TWO.pow(k).multiply(Functions.FACTORIAL.z(n - 2 * k))).multiply(Functions.FACTORIAL.z(n + k))).divide(n + 1).num());
  }
}
