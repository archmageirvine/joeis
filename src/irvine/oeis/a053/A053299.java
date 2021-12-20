package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a000.A000230;

/**
 * A053299 First n-digit prime to begin a gap.
 * @author Sean A. Irvine
 */
public class A053299 extends A000230 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(10);
    while (true) {
      final Z p = super.next();
      if (p.compareTo(mA) > 0) {
        return p;
      }
    }
  }
}

