package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001196 Double-bitters: only even length runs in binary expansion.
 * @author Sean A. Irvine
 */
public class A001196 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    long n = ++mN;
    Z r = Z.ZERO;
    Z v = Z.THREE;
    while (n != 0) {
      if ((n & 1) == 1) {
        r = r.add(v);
      }
      n >>>= 1;
      v = v.shiftLeft(2);
    }
    return r;
  }
}
