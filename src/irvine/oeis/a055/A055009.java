package irvine.oeis.a055;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002110;

/**
 * A055009 Smallest composite number x such that sigma(x + prime(n)#) = sigma(x) + prime(n)#, where prime(n)# = A002110(n) and sigma is A000203.
 * @author Sean A. Irvine
 */
public class A055009 extends A002110 {

  {
    setOffset(1);
    super.next();
  }

  @Override
  public Z next() {
    final Z f = super.next();
    Z k = Z.THREE;
    while (true) {
      k = k.add(1);
      if (!k.isProbablePrime() && Functions.SIGMA.z(f.add(k)).equals(Functions.SIGMA.z(k).add(f))) {
        return k;
      }
    }
  }
}
