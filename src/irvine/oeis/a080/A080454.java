package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000422;

/**
 * A080454 Smallest multiple of n beginning with the backward concatenation of numbers from (n-1) to 1.
 * @author Sean A. Irvine
 */
public class A080454 extends Sequence1 {

  private final Sequence mA = new A000422().prepend(0);
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Z t = mA.next();
    if (t.mod(mN) == 0) {
      return t;
    }
    Z m = Z.ONE;
    while (true) {
      m = m.multiply(10);
      long k = -1;
      while (true) {
        final Z u = t.multiply(m).divide(mN).add(++k).multiply(mN);
        final Z v = u.divide(m);
        final int c = v.compareTo(t);
        if (c >= 0) {
          if (c == 0) {
            return u;
          }
          break;
        }
      }
    }
  }
}

