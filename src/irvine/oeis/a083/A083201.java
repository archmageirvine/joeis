package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083201 a(1) = 1. For n&gt;1, let x = a(n-1)+1; then a(n) is the first prime in the sequence 2*x-1, 2*x-3, 4*x-1, 4*x-3, 8*x-1, 8*x-3, ..., (2^k)*x-1, (2^k)*x-3, ...
 * @author Sean A. Irvine
 */
public class A083201 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return Z.ONE;
    }
    final Z x = mA.add(1);
    long k = 1;
    while (true) {
      k *= 2;
      final Z kx = x.multiply(k);
      for (long s = 1; s < 4; s += 2) {
        final Z t = kx.subtract(s);
        if (t.isProbablePrime()) {
          mA = t;
          return t;
        }
      }
    }
  }
}
