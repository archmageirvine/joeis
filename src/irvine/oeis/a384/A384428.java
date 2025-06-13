package irvine.oeis.a384;

import irvine.math.lattice.Canons;
import irvine.math.lattice.Hunter;
import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelHunter;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicIntArray;
import irvine.util.string.StringUtils;

/**
 * A384428.
 * @author Sean A. Irvine
 */
public class A384428 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final LongDynamicIntArray mA = new LongDynamicIntArray();
  private final ParallelHunter mHunter = new ParallelHunter(6,
    () -> new Hunter(Lattices.Z2, true),
    () -> new Hunter(Lattices.Z2, true) {
      {
        setKeeper((animal, forbidden) -> {
          if (Canons.Z2_FREE.isFreeCanonical(animal) && !animal.isHoly(Lattices.Z2)) {
            long prod = 1;
            for (final long len : animal.edgeLengths(Lattices.Z2)) {
              prod *= len;
            }
            synchronized (mA) {
              if (mA.get(prod) == 0) {
                if (mVerbose) {
                  StringUtils.message(animal.size() + " prod=" + prod + " lengths=" + animal.edgeLengths(Lattices.Z2) + " animal=" + animal.toString(Lattices.Z2));
                }
                mA.set(prod, animal.size());
              }
            }
          }
        });
      }
    }
  );
  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if ((++mN & 3) == 2) {
      return Z.ZERO;
    }
    if (Predicates.PRIME.is(mN)) {
      return Z.valueOf(mN + (mN - 1) / 2);
    }
    while (mA.get(mN) == 0) {
      mHunter.count(++mM);
    }
    return Z.valueOf(mA.get(mN));
  }
}
