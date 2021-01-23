package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.SemiprimeSequence;

/**
 * A050244 Numbers n such that 2^n + 3^n is a semiprime.
 * @author Sean A. Irvine
 */
public class A050244 extends SemiprimeSequence {

  @Override
  protected Z candidate(final int n) {
    return Z.THREE.pow(n).add(Z.ONE.shiftLeft(n));
  }
}
