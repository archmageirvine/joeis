package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a055.A055879;

/**
 * A030529 Number of polyhexes of class <code>PF2</code> with a particular symmetry.
 * @author Sean A. Irvine
 */
public class A030529 implements Sequence {

  private final MemorySequence mM = MemorySequence.cachedSequence(new PrependSequence(new A055879(), 0));
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return mM.a(2 * mN + 1).subtract(mM.a(2 * mN)).subtract(mM.a(mN)).divide2();
  }
}
