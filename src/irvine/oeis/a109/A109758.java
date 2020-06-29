package irvine.oeis.a109;

import irvine.math.z.Z;
import irvine.oeis.SemiprimeSequence;

/**
 * A109758 Numbers n such that <code>(10</code>'s complement factorial of <code>n) - 1</code> is semiprime.
 * @author Sean A. Irvine
 */
public class A109758 extends SemiprimeSequence {

  @Override
  protected Z candidate(final int n) {
    return A109757.tensComplementFactorial(n).subtract(1);
  }
}

