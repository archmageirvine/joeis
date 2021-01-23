package irvine.oeis.a001;

import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001411 Number of n-step self-avoiding walks on square lattice.
 * @author Sean A. Irvine
 */
public class A001411 implements Sequence {

  protected final ParallelWalker mWalker = new ParallelWalker(8, () -> new SelfAvoidingWalker(Lattices.Z2));
  private final long mX1 = Lattices.Z2.toPoint(1, 0);
  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Z.valueOf(mWalker.count(mN, 4, 1, Lattices.Z2.origin(), mX1));
  }
}
