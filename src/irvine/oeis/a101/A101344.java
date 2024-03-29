package irvine.oeis.a101;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-12 11:03

import irvine.factor.prime.Puma;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A101344 Number of primes between prime(n) and 3prime(n).
 * a(n)=primepi(3*prime(n))-n
 * @author Georg Fischer
 */
public class A101344 extends LambdaSequence {

  /** Construct the sequence. */
  public A101344() {
    super(1, n -> Puma.primePiZ(Z.THREE.multiply(Puma.primeZ(n))).subtract(n));
  }
}
