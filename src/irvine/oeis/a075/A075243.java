package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A075169.
 * @author Sean A. Irvine
 */
public class A075243 extends A002808 {

  private long mK = 0;

  @Override
  public Z next() {
    while (true) {
      final Z c = super.next();
      if (Z.FOUR.equals(c)) {
        return c;
      }
      long base = 1;
      while (c.compareTo(++base) > 0 && !Functions.REVERSE.z(base, c).isProbablePrime()) {
        // do nothing
      }
      if (!c.equals(base) && base > mK) {
        mK = base;
        return c;
      }
    }
  }
}
