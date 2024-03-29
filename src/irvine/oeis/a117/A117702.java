package irvine.oeis.a117;
// Generated by gen_seq4.pl 2024-01-07/simtraf at 2024-01-10 22:05

import irvine.math.z.Z;
import irvine.oeis.a029.A029975;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A117702 Palindromic primes in base 7 (written in base 7).
 * @author Georg Fischer
 */
public class A117702 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A117702() {
    super(1, new A029975(), v -> new Z(v.toString(7)));
  }
}
