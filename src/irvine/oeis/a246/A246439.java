package irvine.oeis.a246;
// Generated by gen_seq4.pl 2024-03-13/filtpos at 2024-03-19 13:51

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a164.A164349;

/**
 * A246439 Numbers m such that A164349(m) = 1.
 * @author Georg Fischer
 */
public class A246439 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A246439() {
    super(1, 0, new A164349(), v -> v.equals(Z.ONE));
  }
}
