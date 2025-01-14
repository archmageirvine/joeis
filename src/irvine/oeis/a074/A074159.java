package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074159 Smallest multiple of n which begins with the reverse concatenation of first n natural numbers.
 * @author Sean A. Irvine
 */
public class A074159 extends Sequence1 {

  private final StringBuilder mConcat = new StringBuilder();
  private long mN = 0;

  @Override
  public Z next() {
    mConcat.insert(0, ++mN);
    Z c = new Z(mConcat);
    if (c.mod(mN) == 0) {
      return c;
    }
    long lim = 1;
    while (true) {
      c = c.multiply(10);
      lim *= 10;
      for (long add = 0; add < lim; ++add) {
        final Z t = c.add(add);
        if (t.mod(mN) == 0) {
          return t;
        }
      }
    }
  }
}
