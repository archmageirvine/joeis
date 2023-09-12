package irvine.oeis.a036;

import irvine.factor.prime.Puma;
import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000010;
import irvine.oeis.memory.MemorySequence;

/**
 * A036553 a(n) = phi(prime(n))-prime(phi(n)).
 * @author Sean A. Irvine
 */
public class A036553 extends Sequence1 {

  private final MemorySequence mPhi = MemorySequence.cachedSequence(new PrependSequence(new A000010(), 0));
  private int mN = 0;

  @Override
  public Z next() {
    return mPhi.a((int) Puma.prime(++mN)).subtract(Puma.prime(mPhi.a(mN)));
  }
}
