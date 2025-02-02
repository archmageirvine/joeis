package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A074709.
 * @author Sean A. Irvine
 */
public class A075242 extends A002808 {

  @Override
  public Z next() {
    final long n = super.next().longValueExact();
    long b = 1;
    while (true) {
      if (++b >= n) {
        return Z.ZERO;
      }
      if (Functions.REVERSE.z(b, n).isProbablePrime()) {
        return Z.valueOf(b);
      }
    }
  }
}
