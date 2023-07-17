package irvine.oeis.a001;

import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A001411 Number of n-step self-avoiding walks on square lattice.
 * @author Sean A. Irvine
 */
public class A001411 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A001411(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A001411() {
    super(0);
  }

  protected final ParallelWalker mWalker = new ParallelWalker(8, () -> new SelfAvoidingWalker(Lattices.Z2));
  private final long mX1 = Lattices.Z2.toPoint(1, 0);
  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Z.valueOf(mWalker.count(mN, 4, 1, Lattices.Z2.origin(), mX1));
  }
}
