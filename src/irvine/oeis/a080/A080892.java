package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.SemiprimeSequence;

/**
 * A080892 Numbers n such that 3^n-2 is a semiprime.
 * @author Sean A. Irvine
 */
public class A080892 extends SemiprimeSequence {

  @Override
  protected Z candidate(final int n) {
    return Z.THREE.pow(n).subtract(2);
  }
}

