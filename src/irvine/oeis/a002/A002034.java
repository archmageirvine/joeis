package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002034 Kempner numbers: smallest positive integer m such that n divides <code>m!</code>.
 * @author Sean A. Irvine
 */
public class A002034 implements Sequence {

  protected int mN = 0;

  protected Z kempner(final Z n) {
    if (n.isProbablePrime()) {
      return n;
    }
    long c = 1;
    Z f = Z.ONE;
    while (true) {
      f = f.mod(n);
      if (Z.ZERO.equals(f)) {
        return Z.valueOf(c);
      }
      f = f.multiply(++c);
    }
  }

  @Override
  public Z next() {
    return kempner(Z.valueOf(++mN));
  }
}

