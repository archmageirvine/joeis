package irvine.oeis.a008;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A008322.
 * @author Sean A. Irvine
 */
public class A008322 extends MemorySequence {

  private final TreeSet<Z> mSumSquares = new TreeSet<>();
  {
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
