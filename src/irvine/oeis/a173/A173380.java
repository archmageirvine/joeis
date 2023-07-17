package irvine.oeis.a173;

import irvine.math.lattice.Lattices;
import irvine.math.lattice.NonadjacentWalker;
import irvine.math.lattice.ParallelWalker;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A173380 Number of n-step walks on square lattice (no points repeated, no adjacent points unless consecutive in path).
 * @author Sean A. Irvine
 */
public class A173380 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A173380(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A173380() {
    super(0);
  }

  private final ParallelWalker mWalker = new ParallelWalker(8, () -> new NonadjacentWalker(Lattices.Z2));
  private final long mX1 = Lattices.Z2.toPoint(1, 0);
  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Z.valueOf(mWalker.count(mN, 4, 1, Lattices.Z2.origin(), mX1));
  }
}
