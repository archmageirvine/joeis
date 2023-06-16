package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a014.A014221;
import irvine.oeis.a038.A038081;

/**
 * A048828 Number of identity (asymmetric) trees of width n.
 * @author Sean A. Irvine
 */
public class A048828 extends Sequence0 {

  private final MemorySequence mB = MemorySequence.cachedSequence(new A038081());
  private final MemorySequence mC = MemorySequence.cachedSequence(new A014221());
  private int mN = -1;

  @Override
  public Z next() {
    if ((++mN & 1) == 0) {
      if (mN == 0) {
        return Z.ONE;
      }
      final int n = mN / 2;
      final int b = mB.a(n - 1).intValueExact();
      return Z.ONE.shiftLeft(b).subtract(b + 1).shiftLeft(mC.a(n - 1).longValueExact());
    } else {
      final int n = mN / 2;
      final Z b = mB.a(n);
      return b.multiply(b.subtract(1)).divide2();
    }
  }
}
