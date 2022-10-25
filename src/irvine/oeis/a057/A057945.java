package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002262;

/**
 * A057945 Number of triangular numbers needed to represent n with greedy algorithm.
 * @author Sean A. Irvine
 */
public class A057945 extends MemorySequence {

  private final Sequence mA = new A002262();

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return mA.next();
    } else {
      return a(mA.next().intValueExact()).add(1);
    }
  }
}
