package irvine.oeis.a196;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-26 21:16

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A196555 O.g.f.: Sum_{n&gt;=0} 2*(n+2)^(n-1) * x^n / Product_{k=1..n} (1+k*x).
 * a(n)=sum(k=0,n,(-1)^(n-k)*stirl(n,k,2)*2*(k+2)^(k-1));
 * @author Georg Fischer
 */
public class A196555 extends LambdaSequence {

  /** Construct the sequence. */
  public A196555() {
    super(0, n -> Rationals.SINGLETON.sum(0, n, k -> new Q((Z.NEG_ONE.pow(n - k)).multiply(Functions.STIRLING2.z(n, k)).multiply2()).multiply(new Q(k + 2).pow(k - 1))).num());
  }
}
