package irvine.oeis.a094;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-22 13:29

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A094420 Generalized ordered Bell numbers Bo(n,n).
 * a(n) = sum(k=0,n,k!*n^k*stirl(n,k,2))
 * @author Georg Fischer
 */
public class A094420 extends LambdaSequence {

  /** Construct the sequence. */
  public A094420() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> Functions.FACTORIAL.z(k).multiply(Z.valueOf(n).pow(k)).multiply(Functions.STIRLING2.z(n, k))));
  }
}
