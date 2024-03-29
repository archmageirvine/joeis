package irvine.oeis.a324;
// Generated by gen_seq4.pl 2024-01-18/filtpos at 2024-01-19 19:10

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a156.A156552;

/**
 * A324814 Numbers n &gt; 1 for which sigma(A156552(n)) == 2 (mod 4).
 * @author Georg Fischer
 */
public class A324814 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A324814() {
    super(1, 1, new A156552(), (k, v) -> Jaguar.factor(v).sigma().and(Z.THREE).equals(Z.TWO));
  }
}
