package irvine.oeis.a366;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

import irvine.math.function.Functions;
import irvine.math.lattice.Canons;
import irvine.math.lattice.Hunter;
import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelHunter;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.string.StringUtils;

/**
 * A366443.
 * @author Sean A. Irvine
 */
public class A366443 extends Sequence0 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = 0;
  private int mM = 0;
  private AtomicLong[] mPerimeterCounts = new AtomicLong[1];
  {
    mPerimeterCounts[0] = new AtomicLong(1); // empty polyomino
  }

  private void hunt(final int n) {
    if (mVerbose) {
      StringUtils.message("Generating polyominoes with " + n + " cells");
    }
    final int len = mPerimeterCounts.length;
    mPerimeterCounts = Arrays.copyOf(mPerimeterCounts, 2 * n + 3); // Maximum perimeter for size n
    for (int k = len; k < mPerimeterCounts.length; ++k) {
      mPerimeterCounts[k] = new AtomicLong();
    }
    final ParallelHunter h = new ParallelHunter(7,
      () -> new Hunter(Lattices.Z2, true),
      () -> new Hunter(Lattices.Z2, true) {
        {
          setKeeper((animal, forbidden) -> {
            if (Canons.Z2_FREE.isFreeCanonical(animal)) {
              mPerimeterCounts[animal.perimeterSize(Lattices.Z2)].incrementAndGet();
            }
          });
        }
      });
    h.count(n);
  }

  @Override
  public Z next() {
    if (++mM < 4) {
      return Z.ZERO;
    }
    while (mM >= 2 + Functions.CEIL_SQRT.i(8 * mN + 4) || mN < 2) {
      hunt(++mN);
      if (mVerbose && mPerimeterCounts.length > mM) {
        StringUtils.message("Counts vector: " + Arrays.toString(mPerimeterCounts));
      }
    }
    return Z.valueOf(mPerimeterCounts[mM].get());
  }
}
