package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.SemiprimeSequence;

/**
 * A085724 Numbers k such that 2^k - 1 is a semiprime (A001358).
 * @author Sean A. Irvine
 */
public class A085724 extends SemiprimeSequence {

  @Override
  protected Z candidate(final int n) {
    return Z.ONE.shiftLeft(n).subtract(1);
  }
}
