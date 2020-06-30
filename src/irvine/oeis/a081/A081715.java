package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.SemiprimeSequence;

/**
 * A081715 Numbers n such that <code>3^n+2</code> is a semiprime.
 * @author Sean A. Irvine
 */
public class A081715 extends SemiprimeSequence {

  @Override
  protected Z candidate(final int n) {
    return Z.THREE.pow(n).add(2);
  }
}
