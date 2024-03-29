package irvine.oeis.a255;
// Generated by gen_seq4.pl 2024-01-15/filtpos at 2024-01-17 19:19

import irvine.math.z.ZUtils;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a007.A007623;

/**
 * A255342 Numbers n such that there are exactly two 1's in their factorial base representation (A007623).
 * @author Georg Fischer
 */
public class A255342 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A255342() {
    super(1, 0, new A007623(), v -> ZUtils.digitCounts(v)[1] == 2);
  }
}
