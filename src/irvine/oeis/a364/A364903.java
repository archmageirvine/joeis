package irvine.oeis.a364;
// Generated by gen_seq4.pl 2024-03-14g/filtpos at 2024-03-14 21:15

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a060.A060778;

/**
 * A364903 Numbers k such that A060778(k) = 7.
 * @author Georg Fischer
 */
public class A364903 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A364903() {
    super(1, 1, new A060778(), v -> v.equals(Z.SEVEN));
  }
}
