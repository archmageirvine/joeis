package irvine.oeis.a381;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A381103.
 * @author Sean A. Irvine
 */
public class A381041 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(3);
    long p = 2;
    while (true) {
      p = Functions.NEXT_PRIME.l(p);
      if (mA.add(p + 1).isProbablePrime()) {
        return Z.valueOf(p);
      }
    }
  }
}
