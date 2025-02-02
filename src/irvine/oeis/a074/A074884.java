package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A074851.
 * @author Sean A. Irvine
 */
public class A074884 extends A000040 {

  private long mMax = 0;

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z p2 = p.multiply2();
      long k = 0;
      while (!p2.multiply(++k).add(1).isProbablePrime()) {
        // do nothing
      }
      if (k > mMax) {
        mMax = k;
        return p;
      }
    }
  }
}
