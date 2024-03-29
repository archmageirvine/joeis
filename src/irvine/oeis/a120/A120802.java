package irvine.oeis.a120;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-28 19:36

import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A120802 5^(n^2)+3^n.
 * a(n)=5^(n^2)+3^n
 * @author Georg Fischer
 */
public class A120802 extends LambdaSequence {

  /** Construct the sequence. */
  public A120802() {
    super(0, n -> Z.FIVE.pow((long) n * n).add(Z.THREE.pow(n)));
  }
}
