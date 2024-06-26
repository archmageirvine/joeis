package irvine.oeis.a110;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-12 11:03

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A110477 a(n) = Sum_{k=1..n} k*(prime(k) - k).
 * a(n)=n*(n+1)*(3*prime(n)-2*n-1)/6
 * @author Georg Fischer
 */
public class A110477 extends LambdaSequence {

  /** Construct the sequence. */
  public A110477() {
    super(1, n -> Z.valueOf(n).multiply(Z.valueOf(n + 1)).multiply(Z.THREE.multiply(Functions.PRIME.z(n)).subtract(Z.TWO.multiply(n)).subtract(Z.ONE)).divide(Z.SIX));
  }
}
