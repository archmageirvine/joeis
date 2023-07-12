package irvine.oeis.a152;
// manually cordrectab/cordrec at 2022-07-15 07:53

import irvine.math.z.Z;
import irvine.oeis.a119.A119565;

/**
 * A152184 Primes in A119565.
 * <code>a(n)=(a(n-1)+1+a(n-2)/6)</code>
 * @author Georg Fischer
 */
public class A152184 extends A119565 {

  {
    setOffset(1);
  }

  @Override
  public Z next() {
    while (true) {
      final Z result = super.next();
      if (result.isProbablePrime()) {
        return result;
      }
    }
  }
}
