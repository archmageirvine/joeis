package irvine.oeis.a137;
// Generated by gen_seq4.pl compseq at 2021-05-28 22:45
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.a008.A008846;

/**
 * A137409 Numbers that cannot be the value of 'C' in a primitive Pythagorean triple (A &lt; B; A^2 + B^2 = C^2).
 *
 * @author Georg Fischer
 */
public class A137409 extends ComplementSequence {

  /** Construct the sequence. */
  public A137409() {
    super(new A008846(), Z.ONE);
  }
}
