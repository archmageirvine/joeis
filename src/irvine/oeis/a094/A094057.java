package irvine.oeis.a094;
// Generated by gen_seq4.pl 2024-04-10/simtraf at 2024-04-10 22:07

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a001.A001566;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A094057 Number of digits of A001566(n).
 * @author Georg Fischer
 */
public class A094057 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A094057() {
    super(0, new A001566(), v -> Z.valueOf(Functions.DIGIT_LENGTH.i(v)));
  }
}
