package irvine.oeis.a356;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-22 13:29

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A356908 E.g.f. satisfies A(x)^A(x) = 1/(1 - x)^2.
 * a(n) = sum(k=0,n,2^k*(-k+1)^(k-1)*abs(stirl(n,k,1)));
 * @author Georg Fischer
 */
public class A356908 extends LambdaSequence {

  /** Construct the sequence. */
  public A356908() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> Z.ONE.shiftLeft(k).multiply(Z.valueOf(-k + 1).pow(k - 1)).multiply(Functions.STIRLING1.z(n, k).abs())));
  }
}
