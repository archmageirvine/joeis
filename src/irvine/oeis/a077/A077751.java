package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A077751 Smallest cube that begins and ends in n, or 0 if no such cube exists.
 * @author Sean A. Irvine
 */
public class A077751 extends Sequence0 {

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
      final Z t = Z.valueOf(m).pow(3);
      final long r = t.mod(mM);
      if (r == mN) {
        solnExists = true;
        if (t.toString().startsWith(s)) {
          return t;
        }
      }
    }
    return Z.ZERO;
  }
}
