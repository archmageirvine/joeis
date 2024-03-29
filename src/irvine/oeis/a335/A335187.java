package irvine.oeis.a335;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-12 11:03

import irvine.factor.prime.Puma;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A335187 Total area of all trapezoids with bases p+q, q-p and height p*q with p,q prime, n = p+q and p &lt; q.
 * a(n)=sum(i=1, floor((n-1)/2), i*(n-i)^2*(primepi(i)-primepi(i-1))*(primepi(n-i)-primepi(n-i-1)))
 * @author Georg Fischer
 */
public class A335187 extends LambdaSequence {

  /** Construct the sequence. */
  public A335187() {
    super(1, n -> Integers.SINGLETON.sum(1, (n - 1) / 2, i -> Z.valueOf(i).multiply(Z.valueOf(n - i).square()).multiply(Puma.primePiZ(i).subtract(Puma.primePiZ(i - 1))).multiply(Puma.primePiZ(n - i).subtract(Puma.primePiZ(n - i - 1)))));
  }
}
