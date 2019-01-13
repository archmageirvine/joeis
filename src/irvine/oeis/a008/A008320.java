package irvine.oeis.a008;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A008320.
 * @author Sean A. Irvine
 */
public class A008320 extends MemorySequence {

  private final TreeSet<Z> mSumSquares = new TreeSet<>();

  @Override
  protected Z computeNext() {
    if (isEmpty()) {
      return Z.ONE;
    }
    Z res = get(size() - 1).add(1);
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
