package irvine.oeis.a046;

import irvine.math.lattice.Lattice;
import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046995 Greek-key tours on a 4 X n board; i.e., self-avoiding walks on 4 X n grid starting in top left corner.
 * @author Sean A. Irvine
 */
public class A046995 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final Lattice grid = Lattices.grid(++mN, 4);
    final ParallelWalker walker = new ParallelWalker(8, () -> new SelfAvoidingWalker(grid));
    return Z.valueOf(walker.count(4 * mN - 1, 1, 3, grid.origin()));
  }
}
