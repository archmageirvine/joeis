package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a002.A002212;
import irvine.oeis.a039.A039660;
import irvine.oeis.a055.A055879;

/**
 * A030519 Number of polyhexes of class PF2 with four catafusenes annealated to pyrene.
 * @author Sean A. Irvine
 */
public class A030519 extends AbstractSequence {

  /** Construct the sequence. */
  public A030519() {
    super(8);
  }

  // Make these sequences start naturally at 0
  private final MemorySequence mA = MemorySequence.cachedSequence(new A002212());
  private final MemorySequence mM = MemorySequence.cachedSequence(new PrependSequence(new A055879(), 0));
  private final MemorySequence mLPrime = MemorySequence.cachedSequence(new PrependSequence(new A039660(), 0));
  private int mN = 3;

  @Override
  public Z next() {
    ++mN;
    final Z t = mM.a(mN + 3).subtract(mM.a(mN + 2)).subtract(mM.a(mN + 1).multiply(3)).add(mM.a(mN).multiply(3)).add(mLPrime.a(mN)).divide2();
    return mA.a(mN + 3).subtract(mA.a(mN + 2).multiply(9)).add(mA.a(mN + 1).multiply(25)).subtract(mA.a(mN).multiply(21)).add(t);
  }
}
