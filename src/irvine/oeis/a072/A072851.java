package irvine.oeis.a072;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A072851 a(0) = 0, a(1) = a(2) = 1, a(n) = abs ( Sum{( - 1)^k*a(abs(n - k))*a(k), k=2..n-1}).
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

