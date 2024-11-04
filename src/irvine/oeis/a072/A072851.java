package irvine.oeis.a072;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A072851 a(n) = s(2*n) where s(0) = 0, s(1) = s(2) = 1, s(n) = abs(Sum_{k=2..n-1} (-1)^k * s(n-k) * s(k)).
 * @author Sean A. Irvine
 */
public class A072851 extends CachedSequence {

  /** Construct the sequence. */
  public A072851() {
    super(0, Integer.class, (self, n) -> {
      if (n == 0) {
        return Z.ZERO;
      }
      if (n <= 2) {
        return Z.ONE;
      }
      return Integers.SINGLETON.sum(2, n - 1, k -> Z.NEG_ONE.pow(k).multiply(self.a(n - k).multiply(self.a(k)))).abs();
    });
  }

  @Override
  public Z next() {
    final Z res = super.next();
    super.next();
    return res;
  }
}

