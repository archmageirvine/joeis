package irvine.oeis.a237;
// Generated by gen_seq4.pl 2024-01-07/filamb at 2024-01-10 22:05

import irvine.oeis.FilterLambdaSequence;

/**
 * A237583 Automorphic numbers: n^2 ends with n in base 6.
 * @author Georg Fischer
 */
public class A237583 extends FilterLambdaSequence {

  /** Construct the sequence. */
  public A237583() {
    super(1, 0, v -> v.square().toString(6).endsWith(v.toString(6)));
  }
}
