package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.SemiprimeSequence;

/**
 * A085724 Numbers n such that <code>2^n - 1</code> is a semiprime <code>(A001358)</code>.
 * @author Sean A. Irvine
 */
public class A085724 extends SemiprimeSequence {

  @Override
  protected Z candidate(final int n) {
    return Z.ONE.shiftLeft(n).subtract(1);
  }
}
