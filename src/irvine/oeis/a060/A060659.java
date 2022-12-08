package irvine.oeis.a060;

import java.util.HashSet;

import irvine.math.lattice.Animal;
import irvine.math.lattice.Canons;
import irvine.math.lattice.Hunter;
import irvine.math.lattice.Lattice;
import irvine.math.lattice.Lattices;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.DynamicArray;
import irvine.util.string.StringUtils;

/**
 * A000105 Number of free polyominoes (or square animals) with n cells.
 * @author Sean A. Irvine
 */
public class A060659 implements Sequence {

  private static final Lattice L = Lattices.Z2;
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));

  private static int countDominoTilingsHalf(final Animal animal, final HashSet<Long> used, final long p) {
    int sum = 0;
    // Try and complete a domino in progress
    for (final long q : L.neighbours(p)) {
      if (animal.contains(q) && !used.contains(q)) {
        used.add(q);
        sum += countDominoTilings(animal, used);
        used.remove(q);
      }
    }
    return sum;
  }

  private static int countDominoTilings(final Animal animal, final HashSet<Long> used) {
    if (used.size() == animal.size()) {
      return 1;
    }
    // Find first unused cell and start a new domino at that cell
    for (final long q : animal.points()) {
      if (!used.contains(q)) {
        used.add(q);
        final int sum = countDominoTilingsHalf(animal, used, q);
        used.remove(q);
        return sum;
      }
    }
    return 0;
  }

  private static int countDominoTilings(final Animal animal) {
    if (animal.size() < 2) {
      return 0;
    }
    return countDominoTilings(animal, new HashSet<>());
  }

  private final DynamicArray<Animal> mFirsts = new DynamicArray<>();
  private final Hunter mHunter = new Hunter(L, true) {
    {
      setKeeper((animal, forbidden) -> {
        if (Canons.Z2_FREE.isFreeCanonical(animal)) {
          final int tilings = countDominoTilings(animal);
          if (mFirsts.get(tilings) == null) {
            if (mVerbose) {
              StringUtils.message(animal.toString(L) + " is smallest animal with " + tilings + " tilings");
            }
            mFirsts.set(tilings, animal);
          }
        }
      });
    }
  };

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == null) {
      mM += 2; // Only even sized animals can be tiled with dominoes
      mHunter.count(mM);
    }
    return Z.valueOf(mFirsts.get(mN).size());
  }
}
