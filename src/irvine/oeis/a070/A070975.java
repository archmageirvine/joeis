package irvine.oeis.a070;
// Generated by gen_seq4.pl 2024-06-19/lambdan at 2024-06-19 23:57

import irvine.math.function.Functions;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a006.A006577;

/**
 * A070975 Number of steps to reach 1 in `3x+1' (or Collatz) problem starting with prime(n).
 * @author Georg Fischer
 */
public class A070975 extends LambdaSequence {

  private static final DirectSequence A006577 = new A006577();

  /** Construct the sequence. */
  public A070975() {
    super(1, n -> A006577.a(Functions.PRIME.z(n)));
  }
}
