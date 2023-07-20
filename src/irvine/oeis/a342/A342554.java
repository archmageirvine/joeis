package irvine.oeis.a342;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a002.A002212;
import irvine.oeis.a039.A039658;
import irvine.oeis.a055.A055879;

/**
 * A342554 Number of catafusenes with 2n hexagons and C symmetry.
 * @author Sean A. Irvine
 */
public class A342554 extends Sequence0 {

  private final MemorySequence mA = MemorySequence.cachedSequence(new A002212());
  private final MemorySequence mM = MemorySequence.cachedSequence(new PrependSequence(new A055879(), 0));
  private final MemorySequence mL = MemorySequence.cachedSequence(new PrependSequence(new A039658(), 0));
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z t = mA.a(mN + 1).subtract(mA.a(mN)).subtract(mL.a(mN)).divide2().subtract(mM.a(mN));
    if ((mN & 1) == 0) {
      t = t.subtract(mA.a(mN / 2)).add(mM.a(mN / 2));
    }
    return t.divide2();
  }
}
