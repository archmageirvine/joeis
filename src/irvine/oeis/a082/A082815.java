package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A082815 Consider primes p with a unique representation p = x^2 + y^2, where x is least primitive root of p. a(n) is the first such prime with x increasing in the sequence, x can be found in A082816.
 * @author Sean A. Irvine
 */
public class A082815 extends A000040 {

  private Z mX = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z x = Functions.LEAST_PRIMITIVE_ROOT.z(p);
      if (x.compareTo(mX) > 0 && p.subtract(x.square()).isSquare()) {
        mX = x;
        return p;
      }
    }
  }
}
