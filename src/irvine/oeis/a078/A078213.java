package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078213 Smallest multiple of n beginning and ending in n and with a digit sum that is divisible by n.
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

