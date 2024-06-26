package irvine.oeis.a355;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-22 13:29

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A355373 a(n) = Sum_{k=0..n} k! * (-1)^k * n^(n-k) * Stirling2(n,k).
 * a(n) = sum(k=0,n,k!*(-1)^k*n^(n-k)*stirl(n,k,2));
 * @author Georg Fischer
 */
public class A355373 extends LambdaSequence {

  /** Construct the sequence. */
  public A355373() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> Functions.FACTORIAL.z(k).multiply(Z.NEG_ONE.pow(k)).multiply(Z.valueOf(n).pow(n - k)).multiply(Functions.STIRLING2.z(n, k))));
  }
}
