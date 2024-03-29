package irvine.oeis.a225;
// Generated by gen_seq4.pl 2024-01-15/filtpos at 2024-01-26 21:00

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a000.A000793;

/**
 * A225651 Numbers k that divide A000793(k).
 * @author Georg Fischer
 */
public class A225651 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A225651() {
    super(1, 1, new A000793().skip(1), (k, v) -> v.mod(Z.valueOf(k)).isZero());
  }
}
