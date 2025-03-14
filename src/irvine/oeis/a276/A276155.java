package irvine.oeis.a276;
// Generated by gen_seq4.pl 2024-11-27.ack/complem at 2024-11-27 22:04

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;

/**
 * A276155 Complement of A276154; numbers that cannot be obtained by shifting left the primorial base representation (A049345) of some number.
 * @author Georg Fischer
 */
public class A276155 extends ComplementSequence {

  /** Construct the sequence. */
  public A276155() {
    super(1, new A276154(), Z.ONE);
  }
}
