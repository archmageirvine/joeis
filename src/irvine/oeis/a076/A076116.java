package irvine.oeis.a076;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076116 Start of the smallest string of n consecutive positive numbers with a cube sum, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A076116 extends Sequence1 {

  // After Robert Israel

  protected long mN = 0;

  @Override
  public Z next() {
    if ((++mN & 1) == 1) {
      final FactorSequence fs = Jaguar.factor(mN);
      Z y = Z.ONE;
      for (final Z p : fs.toZArray()) {
        y = y.multiply(p.pow((fs.getExponent(p) + 2) / 3));
      }
      final Z k = Z.ONE.add(CR.valueOf(mN * (mN - 1) / 2).pow(Q.ONE_THIRD).divide(y).floor());
      return k.multiply(y).pow(3).multiply2().subtract(mN * (mN - 1)).divide(2 * mN);
    } else {
      final Z odd = Z.valueOf(mN).makeOdd();
      final long v = odd.auxiliary();
      if (v % 3 != 1) {
        return Z.ZERO;
      }
      final FactorSequence fs = Jaguar.factor(odd);
      Z y = Z.ONE.shiftLeft((v - 1) / 3);
      for (final Z p : fs.toZArray()) {
        y = y.multiply(p.pow((fs.getExponent(p) + 2) / 3));
      }
      final Z k = Z.ONE.add(CR.valueOf(mN * (mN - 1) / 2).pow(Q.ONE_THIRD).divide(y).floor()).or(Z.ONE);
      return k.multiply(y).pow(3).multiply2().subtract(mN * (mN - 1)).divide(2 * mN);
    }
  }
}
