package irvine.oeis.a008;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A008318.
 * @author Sean A. Irvine
 */
public class A008318 extends MemorySequence {

  private final TreeSet<Z> mSumSquares = new TreeSet<>();
  {
    mSumSquares.add(Z.FIVE);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 1) {
      return n == 0 ? Z.ONE : Z.TWO;
    }
    final Z res = mSumSquares.pollFirst();
    final Z s = res.square();
    for (final Z v : this) {
      mSumSquares.add(v.square().add(s));
    }
    return res;
  }
}
