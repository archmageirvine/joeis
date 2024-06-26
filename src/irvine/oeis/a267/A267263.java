package irvine.oeis.a267;
// Generated by gen_seq4.pl 2024-06-16/lambdan at 2024-06-16 23:57

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A267263 Number of nonzero digits in representation of n in primorial base.
 * @author Georg Fischer
 */
public class A267263 extends LambdaSequence {

  /** Construct the sequence. */
  public A267263() {
    super(0, n -> Functions.OMEGA.z(Functions.PRIMORIAL_BASE_EXP.z(n)));
  }
}
