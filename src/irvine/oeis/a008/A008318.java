package irvine.oeis.a008;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A008318 Smallest number strictly greater than previous one which is the sum of squares of two previous distinct terms (a(1)=1, a(2)=2).
 * @author Sean A. Irvine
 */
public class A008318 extends MemorySequence {

  private final TreeSet<Z> mSumSquares = new TreeSet<>();
  {
    setOffset(1);
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
