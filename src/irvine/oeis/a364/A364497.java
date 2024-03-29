package irvine.oeis.a364;
// Generated by gen_seq4.pl 2024-01-18/filtpos at 2024-01-19 19:10

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a243.A243071;

/**
 * A364497 Numbers k such that k divides A243071(k).
 * @author Georg Fischer
 */
public class A364497 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A364497() {
    super(1, 1, new A243071(), (k, v) -> v.mod(Z.valueOf(k)).isZero());
  }
}
