package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078204.
 * @author Sean A. Irvine
 */
public class A078213 extends Sequence1 {

  private long mN = 0;
  private long mMod = 10;

  @Override
  public Z next() {
    if (++mN == mMod) {
      mMod *= 10;
    }
    Z t = Z.valueOf(mN);
    final String ns = String.valueOf(mN);
    while (true) {
      if (t.mod(mMod) == mN && t.toString().startsWith(ns) && Functions.DIGIT_SUM.l(t) % mN == 0) {
        return t;
      }
      t = t.add(mN);
    }
  }
}

