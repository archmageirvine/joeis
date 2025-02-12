package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A075169.
 * @author Sean A. Irvine
 */
public class A075241 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    long k = 1;
    while (true) {
      if (!Functions.REVERSE.z(++k, p).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}
