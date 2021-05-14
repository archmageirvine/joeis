package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a007.A007306;

/**
 * A047679 Denominators in full Stern-Brocot tree.
 * @author Sean A. Irvine
 */
public class A047679 implements Sequence {

  private final MemorySequence mA = MemorySequence.cachedSequence(new A007306());
  private int mN = 1;
  private int mM = 2;

  @Override
  public Z next() {
    if (--mM < 1) {
      mN <<= 1;
      mM = mN;
    }
    return mA.a(mM);
  }
}
