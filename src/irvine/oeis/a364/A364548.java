package irvine.oeis.a364;
// Generated by gen_seq4.pl 2024-01-18/filtpos at 2024-01-19 19:10

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a005.A005941;

/**
 * A364548 Numbers k such that k divides A005941(k).
 * @author Georg Fischer
 */
public class A364548 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A364548() {
    super(1, 1, new A005941(), (k, v) -> v.mod(Z.valueOf(k)).isZero());
  }
}
