package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.FiniteSequence;
import irvine.oeis.UnionSequence;
import irvine.oeis.closure.DistinctAdditiveClosureSequence;
import irvine.oeis.closure.DistinctMultiplicativeClosureSequence;
import irvine.oeis.memory.MemorySequence;

/**
 * A065026 a(1) = 1; for n&gt;1, a(n) = smallest number that is not a sum or product of any subset of the numbers a(1) to a(n-1).
 * @author Sean A. Irvine
 */
public class A065026 extends MemorySequence {

  {
    setOffset(1);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    return new ComplementSequence(new UnionSequence(
      new DistinctAdditiveClosureSequence(new FiniteSequence(toList())),
      new DistinctMultiplicativeClosureSequence(new FiniteSequence(toList()))
    ), a(n - 1)).next();
  }
}

