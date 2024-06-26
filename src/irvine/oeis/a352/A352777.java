package irvine.oeis.a352;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-12 11:03

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A352777 a(n) = Sum_{p &lt;= n &lt;= q &lt; 2n, p,q prime} (p * q).
 * a(n)=sum(i=1, n, sum(k=1, n, k*(2*n-i)*(primepi(k)-primepi(k-1))*(primepi(2*n-i)-primepi(2*n-i-1))))
 * @author Georg Fischer
 */
public class A352777 extends LambdaSequence {

  /** Construct the sequence. */
  public A352777() {
    super(1, n -> Integers.SINGLETON.sum(1, n, i -> Integers.SINGLETON.sum(1, n, k -> Z.valueOf(k).multiply(Z.valueOf(2L * n - i)).multiply(Functions.PRIME_PI.z(k).subtract(Functions.PRIME_PI.z(k - 1))).multiply(Functions.PRIME_PI.z(2L * n - i).subtract(Functions.PRIME_PI.z(2L * n - i - 1))))));
  }
}
