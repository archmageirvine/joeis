package irvine.oeis.a112;
// Generated by gen_seq4.pl 2024-01-04/lambdan at 2024-01-05 23:45

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A112290 Numerator of sum{k=1 to n} 1/S(n,k), where S(n,k) is a Stirling number of the second kind.
 * @author Georg Fischer
 */
public class A112290 extends LambdaSequence {

  /** Construct the sequence. */
  public A112290() {
    super(1, n -> Rationals.SINGLETON.sum(1, n, k -> new Q(Z.ONE, Functions.STIRLING2.z(n, k))).num());
  }
}
