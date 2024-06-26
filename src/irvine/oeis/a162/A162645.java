package irvine.oeis.a162;
// Generated by gen_seq4.pl 2024-04-01/filtpos at 2024-04-01 22:42

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;

/**
 * A162645 Numbers m such that A162511(m) = -1.
 * @author Georg Fischer
 */
public class A162645 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A162645() {
    super(1, 1, new A162511(), v -> v.equals(Z.NEG_ONE));
  }
}
