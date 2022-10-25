package irvine.oeis.a008;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A008321 Smallest number that is not the sum of squares of distinct earlier terms.
 * @author Sean A. Irvine
 */
public class A008321 extends MemorySequence {

  private final TreeSet<Z> mSumSquares = new TreeSet<>();
  {
    setOffset(1);
    mSumSquares.add(Z.ONE);
  }

  @Override
  protected Z computeNext() {
    if (size() == 0) {
      return Z.ONE;
    }
    Z res = a(size() - 1).add(1);
    while (mSumSquares.contains(res)) {
      res = res.add(1);
    }
    final Z s = res.square();
    final TreeSet<Z> newSquares = new TreeSet<>();
    newSquares.add(s);
    for (final Z q : mSumSquares) {
      newSquares.add(q.add(s));
    }
    mSumSquares.addAll(newSquares);
    return res;
  }
}
