package irvine.oeis.a196;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-22 13:29

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A196459 E.g.f.: A(x) = Sum_{n&gt;=0} (2^n + 3^n)^n * exp((5*2^n + 2*3^n)*x) * x^n/n!.
 * a(n)=sum(k=0,n,binom(n,k)*(5 + 2^(n-k)*3^k)^(n-k)*(2 + 2^(n-k)*3^k)^k)
 * @author Georg Fischer
 */
public class A196459 extends LambdaSequence {

  /** Construct the sequence. */
  public A196459() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> Binomial.binomial(n, k).multiply((Z.FIVE).add(Z.ONE.shiftLeft(n - k).multiply(Z.THREE.pow(k))).pow(Z.valueOf(n - k))).multiply((Z.TWO).add(Z.ONE.shiftLeft(n - k).multiply(Z.THREE.pow(k))).pow(k))));
  }
}
