package irvine.oeis.a334;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a023.A023900;
import irvine.oeis.triangle.Triangle;

/**
 * A334312 Triangle read by rows: T(n,k) = Sum_{i=k..n} A191898(i,k).
 * T(n,k) = Sum_{i=k..n} A023900(gcd(i,k)).
 * @author Georg Fischer
 */
public class A334312 extends Triangle {

  private MemorySequence mSeq = MemorySequence.cachedSequence(new PrependSequence(new A023900(), 1));

  /** Construct the sequence. */
  public A334312() {
    setOffset(1);
    hasRAM(true);
  }

  @Override
  public Z compute(int n, int k) {
    ++n;
    ++k;
    Z sum = Z.ZERO;
    for (int i = k; i <= n; ++i) {
      sum = sum.add(mSeq.a(IntegerUtils.gcd(i, k)));
    }
    return sum;
  }
}
