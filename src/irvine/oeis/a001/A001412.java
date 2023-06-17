package irvine.oeis.a001;

import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A001412 Number of n-step self-avoiding walks on cubic lattice.
 * @author Sean A. Irvine
 */
public class A001412 extends AbstractSequence {

  /* Construct the sequence. */
  public A001412() {
    super(0);
  }

  private final ParallelWalker mWalker = new ParallelWalker(8, () -> new SelfAvoidingWalker(Lattices.Z3));
  private final long mC = Lattices.Z3.neighbour(Lattices.Z3.origin(), 0);
  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Z.valueOf(mWalker.count(mN, 6, 1, Lattices.Z3.origin(), mC));
  }
}
