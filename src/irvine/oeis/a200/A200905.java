package irvine.oeis.a200;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-28 19:36

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A200905 a(n) = 3*phi(n), where phi (A000010) is the Euler totient function.
 * a(n)=3*eulerphi(n)
 * @author Georg Fischer
 */
public class A200905 extends LambdaSequence {

  /** Construct the sequence. */
  public A200905() {
    super(1, n -> Z.THREE.multiply(Functions.PHI.l(n)));
  }
}
