package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.a000.A000330;
import irvine.oeis.a002.A002415;

/**
 * A051678 Square-pyramid-tree numbers: a(n) = sum(b(m),m=1..n), b(m) = 1^2, 1^2,2^2, 1^2,2^2,3^2,.. = (A002260)^2.
 * @author Sean A. Irvine
 */
public class A051678 extends A002415 {

  private final MemorySequence mA = MemorySequence.cachedSequence(new A000330());
  {
    super.next();
  }
  private Z mT = super.next();
  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      mT = super.next();
      mM = 0;
      ++mN;
    }
    return mT.add(mA.a(mM));
  }
}
