package irvine.oeis.a133;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-12 11:03

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A133063 a(n) = 5*p^5 + 3*p^3 - 2*p^2, where p = prime(n).
 * a(n)=(prime(n))^2*(5*prime(n)^3+3*prime(n)-2)
 * @author Georg Fischer
 */
public class A133063 extends LambdaSequence {

  /** Construct the sequence. */
  public A133063() {
    super(1, n -> Functions.PRIME.z(n).square().multiply(Z.FIVE.multiply(Functions.PRIME.z(n).pow(Z.THREE)).add(Z.THREE.multiply(Functions.PRIME.z(n))).subtract(Z.TWO)));
  }
}
