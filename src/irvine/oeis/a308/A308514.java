package irvine.oeis.a308;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-12 11:03

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A308514 Take all the integer-sided triangles with perimeter n and side lengths a, b and c such that a &lt;= b &lt;= c and a is prime. a(n) is the sum of all the b's.
 * a(n)=sum(k=1, floor(n/3), sum(i=k, floor((n-k)/2), i*(primepi(k)-primepi(k-1))*sign(floor((i+k)/(n-i-k+1)))))
 * @author Georg Fischer
 */
public class A308514 extends LambdaSequence {

  /** Construct the sequence. */
  public A308514() {
    super(1, n -> Integers.SINGLETON.sum(1, n / 3, k -> Integers.SINGLETON.sum(k, (n - k) / 2, i -> Z.valueOf(i).multiply(Functions.PRIME_PI.z(k).subtract(Functions.PRIME_PI.z(k - 1))).multiply(Z.valueOf(i + k).divide(Z.valueOf(n - i - k + 1)).signum()))));
  }
}
