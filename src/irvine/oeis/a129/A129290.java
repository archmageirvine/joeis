package irvine.oeis.a129;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-24 21:51

import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A129290 Base-3 Fermat numbers: 3^(3^n) + 1.
 * a(n)=3^(3^n)+1
 * @author Georg Fischer
 */
public class A129290 extends LambdaSequence {

  /** Construct the sequence. */
  public A129290() {
    super(0, n -> Z.THREE.pow(Z.THREE.pow(n)).add(Z.ONE));
  }
}
