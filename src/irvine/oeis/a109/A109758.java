package irvine.oeis.a109;

import irvine.math.z.Z;
import irvine.oeis.SemiprimeSequence;

/**
 * A109758 Numbers n such that (10's complement factorial of n) - 1 is semiprime.
 * @author Sean A. Irvine
 */
public class A109758 extends SemiprimeSequence {

  @Override
  protected Z candidate(final int n) {
    return A109757.tensComplementFactorial(n).subtract(1);
  }
}

