package irvine.oeis.a219;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-12 11:03

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A219098 Parity of primepi(3^n).
 * a(n)=mod(primepi(3^n), 2)
 * @author Georg Fischer
 */
public class A219098 extends LambdaSequence {

  /** Construct the sequence. */
  public A219098() {
    super(0, n -> Functions.PRIME_PI.z(Z.THREE.pow(n)).mod(Z.TWO));
  }
}
