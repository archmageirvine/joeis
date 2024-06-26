package irvine.oeis.a229;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-22 13:29

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A229233 O.g.f.: Sum_{n&gt;=0} x^n / Product_{k=1..n} (1 - n*k*x).
 * a(n)=sum(k=0,n,k^(n-k) * stirl(n,k,2))
 * @author Georg Fischer
 */
public class A229233 extends LambdaSequence {

  /** Construct the sequence. */
  public A229233() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> Z.valueOf(k).pow(n - k).multiply(Functions.STIRLING2.z(n, k))));
  }
}
