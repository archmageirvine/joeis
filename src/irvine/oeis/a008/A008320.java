package irvine.oeis.a008;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A008320 Smallest number that is not the sum of squares of two distinct earlier terms.
 * @author Sean A. Irvine
 */
public class A008320 extends MemorySequence {

  {
    setOffset(1);
  }

  private final TreeSet<Z> mSumSquares = new TreeSet<>();

  @Override
  protected Z computeNext() {
    if (size() == 0) {
      return Z.ONE;
    }
    Z res = a(size() - 1).add(1);
    while (mSumSquares.contains(res)) {
      mSumSquares.remove(res);
      res = res.add(1);
    }
    final Z s = res.square();
    for (final Z v : this) {
      mSumSquares.add(v.square().add(s));
    }
    return res;
  }
}
