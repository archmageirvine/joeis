package irvine.oeis.a354;
// Generated by gen_seq4.pl 2023-09-21/LAMBDA at 2023-09-21 17:48

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A354554 Expansion of e.g.f. exp( x * exp(x^4) ).
 * @author Georg Fischer
 */
public class A354554 extends LambdaSequence {

  /** Construct the sequence. */
  public A354554() {
    super(0, n -> Rationals.SINGLETON.sum(0, n / 4, k -> new Q(Z.valueOf(n - 4L * k).pow(k), Functions.FACTORIAL.z(k).multiply(Functions.FACTORIAL.z(n - 4 * k)))).multiply(Functions.FACTORIAL.z(n)).num());
  }
}
