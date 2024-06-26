package irvine.oeis.a133;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-28 19:36

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A133751 a(n) = 2*(2+n)! + 2^n.
 * a(n)=2*(2+n)!+2^n
 * @author Georg Fischer
 */
public class A133751 extends LambdaSequence {

  /** Construct the sequence. */
  public A133751() {
    super(0, n -> Z.TWO.multiply(Functions.FACTORIAL.z(2 + n)).add(Z.ONE.shiftLeft(n)));
  }
}
