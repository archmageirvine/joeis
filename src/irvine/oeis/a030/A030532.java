package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002212;
import irvine.oeis.a039.A039658;
import irvine.oeis.a039.A039660;
import irvine.oeis.a039.A039919;
import irvine.oeis.a055.A055879;

/**
 * A030532 Number of polyhexes of class <code>PF2</code>.
 * @author Sean A. Irvine
 */
public class A030532 implements Sequence {

  // Make these sequences start naturally at 0
  private final MemorySequence mA = MemorySequence.cachedSequence(new A002212());
  private final MemorySequence mM = MemorySequence.cachedSequence(new PrependSequence(new A055879(), 0));
  private final MemorySequence mL = MemorySequence.cachedSequence(new PrependSequence(new A039658(), 0));
  private final MemorySequence mMPrime = MemorySequence.cachedSequence(new PrependSequence(new A039919(), 0));
  private final MemorySequence mLPrime = MemorySequence.cachedSequence(new PrependSequence(new A039660(), 0));
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    final Z t = mA.a(mN + 1).multiply(41)
      .subtract(mA.a(mN).multiply(21))
      .subtract(mL.a(mN))
      .divide(4);
    final Z u = mM.a(mN + 3)
      .subtract(mM.a(mN + 2))
      .add(mM.a(mN))
      .subtract((mN & 1) == 0 ? mM.a(mN / 2) : Z.ZERO)
      .add(mLPrime.a(mN)).divide2();
    return mA.a(mN + 3)
      .subtract(mA.a(mN + 2).multiply(6))
      .add(t)
      .subtract(u)
      .subtract(mMPrime.a((mN + 1) / 2));
  }
}
