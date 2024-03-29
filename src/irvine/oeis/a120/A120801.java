package irvine.oeis.a120;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-28 19:36

import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A120801 a(n) = 3^(n^2) - 2^(n^2).
 * a(n)=3^(n^2)-2^(n^2)
 * @author Georg Fischer
 */
public class A120801 extends LambdaSequence {

  /** Construct the sequence. */
  public A120801() {
    super(0, n -> Z.THREE.pow((long) n * n).subtract(Z.ONE.shiftLeft((long) n * n)));
  }
}
