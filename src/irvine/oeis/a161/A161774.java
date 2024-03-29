package irvine.oeis.a161;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-12 11:03

import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A161774 a(n) = n^(3n^3 + 2).
 * a(n)=n^(3*n^3+2)
 * @author Georg Fischer
 */
public class A161774 extends LambdaSequence {

  /** Construct the sequence. */
  public A161774() {
    super(1, n -> Z.valueOf(n).pow(Z.THREE.multiply(Z.valueOf(n).pow(3)).add(2)));
  }
}
