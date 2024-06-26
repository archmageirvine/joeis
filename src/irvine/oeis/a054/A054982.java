package irvine.oeis.a054;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A054982 a(n) = least composite number such that sigma(a(n)+n!) = sigma(a(n))+n! where sigma() = A000203.
 * @author Sean A. Irvine
 */
public class A054982 extends A000142 {

  {
    setOffset(2);
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    final Z f = super.next();
    Z k = Z.THREE;
    while (true) {
      k = k.add(1);
      if (!k.isProbablePrime() && Functions.SIGMA1.z(f.add(k)).equals(Functions.SIGMA1.z(k).add(f))) {
        return k;
      }
    }
  }
}
