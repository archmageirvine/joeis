package irvine.oeis.a057;

import java.util.Set;

import irvine.math.lattice.Animal;
import irvine.math.lattice.Lattices;
import irvine.oeis.NaiveHunterSequence;

/**
 * A057787 Number of polyarcs with n cells.
 * @author Sean A. Irvine
 */
public class A057787 extends NaiveHunterSequence {

  // Within a single cell these are allowed pairings
  private static final int[][] FORBIDDEN = {
    {1, 2, 3, 5, 6, 7}, // 0
    {0, 2, 3, 4, 6, 7}, // 1
    {0, 1, 3, 4, 5, 7}, // 2
    {0, 1, 2, 4, 5, 6}, // 3
    {1, 2, 3, 5, 7}, // 4
    {0, 2, 3, 4, 6}, // 5
    {0, 1, 3, 5, 7}, // 6
    {0, 1, 2, 4, 6}, // 7
  };

  /** Construct the sequence. */
  public A057787() {
    super(Lattices.ARC);
  }

  @Override
  protected void init(final Set<Animal> animals) {
    super.init(animals); // inside of arc
    animals.add(new Animal(mL.toPoint(0, 0, 4))); // outside of arc
  }

  @Override
  protected boolean accept(final Animal animal, final long pt) {
    if (!super.accept(animal, pt)) {
      return false;
    }
    // We need to check proposed z is compatible with any existing pt at x,y
    final long x = mL.ordinate(pt, 0);
    final long y = mL.ordinate(pt, 1);
    final int z = (int) mL.ordinate(pt, 2);

    for (final int c : FORBIDDEN[z]) {
      if (animal.contains(mL.toPoint(x, y, c))) {
        return false;
      }
    }
    return true;
  }
}
