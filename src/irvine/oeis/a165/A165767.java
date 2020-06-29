package irvine.oeis.a165;

import irvine.math.z.Z;
import irvine.oeis.SemiprimeSequence;

/**
 * A165767 Numbers m such that <code>2^m-m</code> is a semiprime.
 * @author Sean A. Irvine
 */
public class A165767 extends SemiprimeSequence {

  @Override
  protected Z candidate(final int n) {
    return Z.ONE.shiftLeft(n).subtract(n);
  }
}

