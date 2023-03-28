package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a002.A002385;

/**
 * A030683 Smallest nontrivial extension of n-th palindromic prime which is a cube.
 * @author Sean A. Irvine
 */
public class A030683 extends A002385 {

  @Override
  public Z next() {
    Z t = super.next().multiply(10);
    long lim = 10;
    long v = -1;
    while (true) {
      if (++v >= lim) {
        lim *= 10;
        t = t.multiply(10);
        v = 0; // to allow for leading 0s in what is appended
      }
      final Z u = t.add(v);
      if (ZUtils.isCube(u)) {
        return u;
      }
    }
  }
}

