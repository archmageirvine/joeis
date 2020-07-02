package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.SemiprimeSequence;

/**
 * A085746 Numbers n such that <code>n^2 + n + 1</code> is a semiprime.
 * @author Sean A. Irvine
 */
public class A085746 extends SemiprimeSequence {

  @Override
  protected Z candidate(final int n) {
    return Z.valueOf(n).square().add(n + 1);
  }
}
