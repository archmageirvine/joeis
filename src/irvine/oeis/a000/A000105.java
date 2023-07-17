package irvine.oeis.a000;

import irvine.math.lattice.Canons;
import irvine.math.lattice.Hunter;
import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelHunter;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000105 Number of free polyominoes (or square animals) with n cells.
 * @author Sean A. Irvine
 */
public class A000105 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A000105(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A000105() {
    super(0);
  }

  private final ParallelHunter mHunter = new ParallelHunter(6,
    () -> new Hunter(Lattices.Z2, true),
    () -> new Hunter(Lattices.Z2, true) {
      {
        setKeeper((animal, forbidden) -> {
          if (Canons.Z2_FREE.isFreeCanonical(animal)) {
            increment(1);
          }
        });
      }
    }
  );

  protected int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(mHunter.count(++mN));
  }
}
