package irvine.oeis.a096;
// Generated by gen_seq4.pl A096553/tuptraf at 2023-11-29 23:09

import irvine.math.z.Z;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A096561 Consecutive internal states of the second of the two linear congruential random number generators whose combined output is used in function RANDOM_NUMBER in version 8 of the Intel FORTRAN Compiler for Linux, using its intrinsic initialization.
 * @author Georg Fischer
 */
public class A096561 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A096561() {
    super(1, (n, s) -> s[0].multiply(40692).mod(Z.valueOf(2147483399L)), "2147483398", PREVIOUS);
  }
}
