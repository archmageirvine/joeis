package irvine.oeis.a079;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-24 21:51

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A079288 a(n) = (3^n)!.
 * a(n) = (3^n)!
 * @author Georg Fischer
 */
public class A079288 extends LambdaSequence {

  /** Construct the sequence. */
  public A079288() {
    super(0, n -> Functions.FACTORIAL.z(Z.THREE.pow(n)));
  }
}
