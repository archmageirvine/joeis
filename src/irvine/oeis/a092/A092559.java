package irvine.oeis.a092;

import irvine.math.z.Z;
import irvine.oeis.SemiprimeSequence;

/**
 * A092559 Numbers k such that 2^k + 1 is a semiprime.
 * @author Sean A. Irvine
 */
public class A092559 extends SemiprimeSequence {

  @Override
  protected Z candidate(final int n) {
    return Z.ONE.shiftLeft(n).add(1);
  }
}
