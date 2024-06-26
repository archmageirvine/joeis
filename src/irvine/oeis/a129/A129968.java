package irvine.oeis.a129;
// Generated by gen_seq4.pl 2024-04-10/simtraf at 2024-04-10 22:07

import irvine.math.function.Functions;
import irvine.oeis.a061.A061909;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A129968 a(n) = sum of digits of A061909(n).
 * @author Georg Fischer
 */
public class A129968 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A129968() {
    super(1, new A061909().skip(1), v -> Functions.DIGIT_SUM.z(v));
  }
}
