package irvine.oeis.a123;
// Generated by gen_seq4.pl 2024-11-27.ack/complem at 2024-11-27 22:04

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.a061.A061909;

/**
 * A123977 Complement of A061909 (skinny numbers).
 * @author Georg Fischer
 */
public class A123977 extends ComplementSequence {

  /** Construct the sequence. */
  public A123977() {
    super(1, new A061909(), Z.ONE);
  }
}
