package irvine.oeis.a318;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-12 11:03

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A318459 a(n) = gcd(n, tau(n), phi(n)), where tau = A000005 and phi = A000010.
 * a(n)=gcd(n, sigma(n, 0), eulerphi(n))
 * @author Georg Fischer
 */
public class A318459 extends LambdaSequence {

  /** Construct the sequence. */
  public A318459() {
    super(1, n -> Z.valueOf(n).gcd(Functions.SIGMA0.z(n).gcd(Functions.PHI.l(n))));
  }
}
