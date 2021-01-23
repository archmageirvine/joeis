package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.a000.A000796;

/**
 * A038099 a(n) &gt; first location of string of a(n) in decimal expansion of Pi.
 * @author Sean A. Irvine
 */
public class A038099 extends A000796 {

  private final StringBuilder mPi = new StringBuilder();
  private int mN = -1;
  {
    super.next(); // skip 3
  }

  @Override
  public Z next() {
    while (true) {
      final String query = String.valueOf(++mN);
      int pos;
      while ((pos = mPi.indexOf(query)) < 0) {
        for (int k = 0; k < 1000; ++k) {
          mPi.append(super.next());
        }
      }
      if (pos + 1 < mN) {
        return Z.valueOf(mN);
      }
    }
  }
}
