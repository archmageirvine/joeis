package irvine.oeis.a262;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-12 11:03

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A262206 Product of prime(n) consecutive numbers starting from n.
 * a(n)=(prime(n)+n-1)!/(n-1)!
 * @author Georg Fischer
 */
public class A262206 extends LambdaSequence {

  /** Construct the sequence. */
  public A262206() {
    super(1, n -> Functions.FACTORIAL.z(Functions.PRIME.z(n).add(n).subtract(Z.ONE)).divide(Functions.FACTORIAL.z(n - 1)));
  }
}
