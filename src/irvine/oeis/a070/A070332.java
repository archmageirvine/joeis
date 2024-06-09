package irvine.oeis.a070;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A070287.
 * @author Sean A. Irvine
 */
public class A070332 extends Sequence2 {

  private int mN = 1;
  private int mMod = 10;

  @Override
  public Z next() {
    if (++mN >= 10 && (mN & 3) == 2) {
      return Z.ZERO;
    }
    if (mN % 10 == 0) {
      return Z.ZERO;
    }
    if (mN > 5 && mN % 5 == 0 && mN % 25 != 0) {
      return Z.ZERO;
    }
    if (mN > mMod) {
      mMod *= 10;
    }
    final HashSet<Long> seen = new HashSet<>();
    Z t = Z.valueOf(mN);
    while (true) {
      t = t.multiply(mN);
      final long v = t.mod(mMod);
      if (v == mN) {
        return t;
      }
      if (!seen.add(v)) {
        return Z.ZERO;
      }
    }
  }
}
