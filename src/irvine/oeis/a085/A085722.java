package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.SemiprimeSequence;

/**
 * A085722 Numbers k such that k^2 + 1 is a semiprime.
 * @author Sean A. Irvine
 */
public class A085722 extends SemiprimeSequence {

  @Override
  protected Z candidate(final int n) {
    return Z.valueOf(n).square().add(1);
  }
}
