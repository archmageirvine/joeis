package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.FiniteSequence;

/**
 * A061094 The alternating group A_n contains an element x which is not conjugate to its inverse (equivalently not all the entries in the character table of A_n are real numbers).
 * @author Sean A. Irvine
 */
public class A061094 extends ComplementSequence {

  /** Construct the sequence. */
  public A061094() {
    super(new FiniteSequence(1, 2, 5, 6, 10, 14), Z.ONE);
  }
}
