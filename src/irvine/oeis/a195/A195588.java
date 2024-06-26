package irvine.oeis.a195;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-25 11:10

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A195588 a(n) = Sum_{k=0..2*n} (-1)^k * moebius(2*n-k+1) * moebius(k+1).
 * a(n)=sum(k=0,2*n,(-1)^k*moebius(2*n-k+1)*moebius(k+1))
 * @author Georg Fischer
 */
public class A195588 extends LambdaSequence {

  /** Construct the sequence. */
  public A195588() {
    super(0, n -> Integers.SINGLETON.sum(0, 2 * n, k -> Z.NEG_ONE.pow(k).multiply(Functions.MOBIUS.i(2L * n - k + 1)).multiply(Functions.MOBIUS.i(k + 1))));
  }
}
