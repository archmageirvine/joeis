package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a055.A055879;

/**
 * A030520 Number of polyhexes of class <code>PF2</code>.
 * @author Sean A. Irvine
 */
public class A030520 implements Sequence {

  private final MemorySequence mM = MemorySequence.cachedSequence(new PrependSequence(new A055879(), 0));
  private int mN = -2;

  @Override
  public Z next() {
    mN += 2;
    final Z t = mM.a(mN + 1).subtract(mM.a(mN)).multiply(3).add(mM.a(mN / 2));
    return mM.a(mN + 3).subtract(mM.a(mN + 2)).subtract(t.divide2());
  }
}
