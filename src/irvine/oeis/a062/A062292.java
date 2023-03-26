package irvine.oeis.a062;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A062292.
 * @author Sean A. Irvine
 */
public class A062292 extends MemorySequence {

  private long mN = 0;
  private final HashSet<Z> mSums = new HashSet<>();

  private boolean isOk(final Z cube) {
    for (final Z v : this) {
      if (mSums.contains(v.add(cube))) {
        return false;
      }
    }
    return true;
  }

  @Override
  protected Z computeNext() {
    while (true) {
      final Z cube = Z.valueOf(++mN).pow(3);
      if (isOk(cube)) {
        for (final Z v : this) {
          mSums.add(cube.add(v));
        }
        mSums.add(cube.multiply2());
        return cube;
      }
    }
  }
}

