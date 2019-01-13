package irvine.oeis.a008;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A008321.
 * @author Sean A. Irvine
 */
public class A008321 extends MemorySequence {

  private final TreeSet<Z> mSumSquares = new TreeSet<>();
  {
    mSumSquares.add(Z.ONE);
  }

  @Override
  protected Z computeNext() {
    if (isEmpty()) {
      return Z.ONE;
    }
    Z res = get(size() - 1).add(1);
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
