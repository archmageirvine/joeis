package irvine.oeis.a167;
// Generated by gen_seq4.pl 2024-04-08/filter at 2024-04-08 19:12

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000290;

/**
 * A167037 Squares that remain squares when prefixed with a 3.
 * @author Georg Fischer
 */
public class A167037 extends FilterSequence {

  /** Construct the sequence. */
  public A167037() {
    super(1, new A000290(), v -> v.add(Z.TEN.pow(Functions.DIGIT_LENGTH.l(v)).multiply(3)).isSquare());
  }
}
