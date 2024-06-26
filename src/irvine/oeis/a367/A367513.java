package irvine.oeis.a367;
// Generated by gen_seq4.pl 2024-06-24/lambdan at 2024-06-24 23:40

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;

/**
 * A367513 The exponentially evil part of n: the largest unitary divisor of n that is an exponentially evil number (A262675).
 * @author Georg Fischer
 */
public class A367513 extends LambdaSequence {

  private static final DirectSequence A367514 = new A367514();

  /** Construct the sequence. */
  public A367513() {
    super(1, n -> Z.valueOf(n).divide(A367514.a(n)));
  }
}
