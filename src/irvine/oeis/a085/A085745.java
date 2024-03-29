package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.SemiprimeSequence;

/**
 * A085745 Numbers m such that 2^m + m is a semiprime.
 * @author Sean A. Irvine
 */
public class A085745 extends SemiprimeSequence {

  @Override
  protected Z candidate(final int n) {
    return Z.ONE.shiftLeft(n).add(n);
  }
}
