package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A014223.
 * @author Sean A. Irvine
 */
public class A014223 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z p3 = p.multiply(3);
      if (mFast.isPrime(p3.add(1).divide2()) && mFast.isPrime(p3.add(4))) {
        return p;
      }
    }
  }
}
