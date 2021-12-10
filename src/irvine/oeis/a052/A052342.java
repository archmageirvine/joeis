package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.transform.StirlingBernoulliTransform;

/**
 * A052342 Shifts left under Stirling-Bernoulli transform.
 * @author Sean A. Irvine
 */
public class A052342 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 1) {
      return Z.ONE;
    }
    return StirlingBernoulliTransform.transform(this);
  }
}
