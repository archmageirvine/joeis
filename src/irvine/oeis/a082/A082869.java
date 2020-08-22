package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.SemiprimeSequence;

/**
 * A082869 3^n - 2^n is a semiprime.
 * @author Sean A. Irvine
 */
public class A082869 extends SemiprimeSequence {

  @Override
  protected Z candidate(final int n) {
    return Z.THREE.pow(n).subtract(Z.ONE.shiftLeft(n));
  }
}

