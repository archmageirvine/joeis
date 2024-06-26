package irvine.oeis.a167;
// Generated by gen_seq4.pl 2024-04-08/filter at 2024-04-08 19:12

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000578;

/**
 * A167731 Cubes that becomes a prime number when prefixed with a 7.
 * @author Georg Fischer
 */
public class A167731 extends FilterSequence {

  /** Construct the sequence. */
  public A167731() {
    super(1, new A000578(), v -> v.add(Z.TEN.pow(Functions.DIGIT_LENGTH.i(v)).multiply(7)).isProbablePrime());
  }
}
