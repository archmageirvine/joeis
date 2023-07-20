package irvine.oeis.a032;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A032048 Number of dyslexic rooted planar trees with n nodes where any 2 subtrees extending from a node are of different sizes.
 * @author Sean A. Irvine
 */
public class A032048 extends MemorySequence {

  private final MemorySequence mA = new A032047();
  private final List<Z> mBfk = new ArrayList<>();

  {
    setOffset(1);
    add(null);
    mBfk.add(null);
  }

  @Override
  protected Z computeNext() {
    mBfk.add(mA.next());
    if (size() < 2) {
      return Z.ONE;
    }
    return A032010.cfk(mBfk).get(size() - 1);
  }
}
