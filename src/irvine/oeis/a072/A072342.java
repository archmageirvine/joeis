package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072339.
 * @author Sean A. Irvine
 */
public class A072342 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z r = Functions.REVERSE.z(++mN);
    long k = 0;
    while (true) {
      if (r.multiply(++k).add(1).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}
