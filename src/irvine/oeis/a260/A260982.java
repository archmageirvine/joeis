package irvine.oeis.a260;
// Generated by gen_seq4.pl exprs/lambda at 2023-09-24 23:56

import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A260982 a(n) = (2^(2^(n+1)) + 2^(2^n) + 1)/21.
 * @author Georg Fischer
 */
public class A260982 extends LambdaSequence {

  /** Construct the sequence. */
  public A260982() {
    super(1, n -> Z.TWO.pow(Z.TWO.pow(n + 1)).add(Z.TWO.pow(Z.ONE.shiftLeft(n))).add(Z.ONE).divide(Z.valueOf(21)));
  }
}
