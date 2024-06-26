package irvine.oeis.a351;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-22 13:29

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A351134 a(n) = Sum_{k=0..n} k! * k^(3*n) * Stirling1(n,k).
 * a(n) = sum(k=0,n,k!*k^(3*n)*stirl(n,k,1));
 * @author Georg Fischer
 */
public class A351134 extends LambdaSequence {

  /** Construct the sequence. */
  public A351134() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> Functions.FACTORIAL.z(k).multiply(Z.valueOf(k).pow(3L * n)).multiply(Functions.STIRLING1.z(n, k))));
  }
}
