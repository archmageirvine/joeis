package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A077752 Smallest number whose cube begins and ends in n, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A077752 extends Sequence0 {

  private long mN = -1;
  private long mM = 10;

  @Override
  public Z next() {
    if (++mN == mM) {
      mM *= 10;
    }
    final String s = String.valueOf(mN);
    boolean solnExists = false; // Assumes if an ending exists, then a beginning will as well
    for (long m = 1; m < mM || solnExists; ++m) {
      final Z u = Z.valueOf(m);
      final Z t = u.pow(3);
      final long r = t.mod(mM);
      if (r == mN) {
        solnExists = true;
        if (t.toString().startsWith(s)) {
          return u;
        }
      }
    }
    return Z.ZERO;
  }
}
