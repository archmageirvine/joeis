package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001165 Position of first even digit after decimal point in sqrt(n).
 * @author Sean A. Irvine
 */
public class A001165 implements Sequence {

  private static final Z HUNDRED = Z.valueOf(100);

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(HUNDRED);
    Z v = mN;
    long p = 0;
    while (true) {
      ++p;
      if ((v.sqrt().mod(10) & 1) == 0) {
        return Z.valueOf(p);
      }
      v = v.multiply(HUNDRED);
    }
  }
}
