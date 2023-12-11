package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.memory.MemorySequence;

/**
 * A038642 Least k such that k-th and (k+1)-st term of A038593 are the first consecutive pair that differ by n.
 * @author Sean A. Irvine
 */
public class A038642 extends Sequence1 {

  private final MemorySequence mA = MemorySequence.cachedSequence(new A038593());
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    int k = -1;
    while (true) {
      if (mA.a(++k).add(mN).equals(mA.a(k + 1))) {
        return Z.valueOf(k + 1);
      }
    }
  }
}
