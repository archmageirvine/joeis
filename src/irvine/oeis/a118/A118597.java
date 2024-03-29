package irvine.oeis.a118;
// Generated by gen_seq4.pl 2024-01-07/simtraf at 2024-01-10 22:05

import irvine.math.z.Z;
import irvine.oeis.a029.A029953;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A118597 Palindromes in base 6 (written in base 6).
 * @author Georg Fischer
 */
public class A118597 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A118597() {
    super(1, new A029953(), v -> new Z(v.toString(6)));
  }
}
