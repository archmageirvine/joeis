package irvine.oeis.a019;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A019511.
 * @author Sean A. Irvine
 */
public class A019511 extends MemorySequence {

  private Z mLimit = Z.valueOf(100);
  private final TreeSet<Z> mSumCubes = new TreeSet<>();
  {
    mSumCubes.add(Z.TWO);
  }

  private boolean add(final TreeSet<Z> cubes, final Z cube) {
    if (cube.compareTo(mLimit) < 0) {
      cubes.add(cube);
      return true;
    }
    return false;
  }

  private void augment(final Z res) {
    final Z cube = res.pow(3);
    final TreeSet<Z> newCubeSums = new TreeSet<>();
    add(newCubeSums, cube);
    add(newCubeSums, cube.add(2));
    add(newCubeSums, cube.add(res));
    for (final Z s : this) {
      if (!add(newCubeSums, s.add(cube))) {
        break;
      }
    }
    for (final Z s : mSumCubes) {
      if (!add(newCubeSums, s.add(cube))) {
        break;
      }
    }
    mSumCubes.addAll(newCubeSums);
  }

  private void augment2(final Z res) {
    final Z cube = res.pow(3);
    final TreeSet<Z> newCubeSums = new TreeSet<>();
    add(newCubeSums, cube);
    add(newCubeSums, cube.add(res));
    for (final Z s : mSumCubes) {
      if (!add(newCubeSums, s.add(cube))) {
        break;
      }
    }
    mSumCubes.addAll(newCubeSums);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 1) {
      return Z.ONE;
    }
    while (mSumCubes.isEmpty()) {
      // If we run out of terms, redo the entire calculation up this point keeping higher terms.
      mLimit = mLimit.multiply(100);
      mSumCubes.add(Z.ONE);
      mSumCubes.add(Z.TWO);
      for (int k = 2; k < n; ++k) {
        augment2(get(k));
      }
      while (!mSumCubes.isEmpty() && mSumCubes.first().compareTo(get(n - 1)) <= 0) {
        mSumCubes.pollFirst();
      }
    }
    final Z res = mSumCubes.pollFirst();
    augment(res);
    return res;
  }
}
