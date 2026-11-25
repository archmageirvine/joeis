package irvine.oeis.a087;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a065.A065447;

/**
 * A087552 a(1) = 1, then the smallest prime divisor of A065447(n) not included earlier.
 * @author Sean A. Irvine
 */
public class A087552 extends A065447 {

  private final HashSet<Z> mSeen = new HashSet<>();

  @Override
  public Z next() {
    Z t = super.next();
    if (t.isOne()) {
      return t;
    }
    while (true) {
      final Z lpf = Functions.LPF.z(t);
      if (lpf.isOne()) {
        throw new RuntimeException();
      }
      if (mSeen.add(lpf)) {
        return lpf;
      }
      do {
        t = t.divide(lpf);
      } while (t.mod(lpf).isZero());
    }
  }
}
