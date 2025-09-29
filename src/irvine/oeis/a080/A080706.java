package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080706 Powers of 3 that reach ...,7,8,4,2,1 under the mapping: if n is even divide by 2 else add 1.
 * @author Sean A. Irvine
 */
public class A080706 extends Sequence1 {

  private long mN = 1;

  private boolean is(final long n) {
    Z m = Z.THREE.pow(n);
    while (!m.isOne()) {
      if (Z.SEVEN.equals(m)) {
        return true;
      }
      m = m.add(1).makeOdd();
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
