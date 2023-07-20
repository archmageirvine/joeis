package irvine.oeis.a254;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.a126.A126760;

/**
 * A254048 a(n) = A126760(A007494(n)).
 * <code>a(4n) = A126760(n); a(4n+1) = A126760(3n+1); a(4n+2) = A126760(2n+1); a(4n+3) = 2n+2.</code>
 * @author Georg Fischer
 */
public class A254048 extends A126760 {

  private final MemorySequence mSeq = MemorySequence.cachedSequence(new A126760());
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final int n = mN / 4;
    switch (mN % 4) {
      case 0:
        return mSeq.a(n);
      case 1:
        return mSeq.a(3 * n + 1);
      case 2:
        return mSeq.a(2 * n + 1);
      case 3:
      default:
        return Z.valueOf(2 * n + 2);
    }
  }
}
