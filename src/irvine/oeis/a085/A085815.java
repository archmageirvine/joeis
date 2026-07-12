package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.a056.A056830;

/**
 * A085815 Least k such that A056830(n) + k is prime, where A056830 = alternate digits 1 and 0.
 * @author Sean A. Irvine
 */
public class A085815 extends A056830 {

  @Override
  public Z next() {
    final Z t = super.next();
    long k = -1;
    while (!t.add(++k).isProbablePrime()) {
      // do nothing
    }
    return Z.valueOf(k);
  }
}
