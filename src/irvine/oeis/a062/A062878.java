package irvine.oeis.a062;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a127.A127872;

/**
 * A062878 a(n) is the position of A050614(n) in A062877.
 * @author Sean A. Irvine
 */
public class A062878 extends Sequence0 {

  private final MemorySequence mA = MemorySequence.cachedSequence(new A127872());
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sum(0, mN, k -> mA.a(mN * (mN + 1) / 2 + k).shiftLeft(k));
  }
}

