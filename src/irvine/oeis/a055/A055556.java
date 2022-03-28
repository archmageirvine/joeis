package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.a045.A045882;

/**
 * A055556 Differences of arithmetic progressions of which the terms give chains of n consecutive nonsquarefree numbers if started with terms of A045882(n) or A051681(n).
 * @author Sean A. Irvine
 */
public class A055556 extends A045882 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Z x = super.next();
    Z t = x;
    for (int k = 1; k < mN; ++k) {
      t = t.lcm(x.add(k));
    }
    return t;
  }
}
