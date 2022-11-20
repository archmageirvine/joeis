package irvine.oeis.a060;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A060444 Table T(n,k) in which n-th row lists prime factors of 2^n + 1 (n &gt;= 0), without repetition.
 * @author Sean A. Irvine
 */
public class A060444 extends Sequence0 {

  private Z[] mFactors = {};
  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM >= mFactors.length) {
      final Z f = Z.ONE.shiftLeft(++mN).add(1);
      mFactors = Jaguar.factor(f).toZArray();
      mM = 0;
    }
    return mFactors.length == 0 ? Z.ONE : mFactors[mM];
  }
}
