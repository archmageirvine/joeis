package irvine.oeis.a008;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A008322 Smallest number that is sum of cubes of two distinct earlier terms.
 * @author Sean A. Irvine
 */
public class A008322 extends MemorySequence {

  private final TreeSet<Z> mSumSquares = new TreeSet<>();
  {
    setOffset(1);
    mSumSquares.add(Z.NINE);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 1) {
      return n == 0 ? Z.ONE : Z.TWO;
    }
    final Z res = mSumSquares.pollFirst();
    final Z s = res.pow(3);
    for (final Z v : this) {
      mSumSquares.add(v.pow(3).add(s));
    }
    return res;
  }
}
