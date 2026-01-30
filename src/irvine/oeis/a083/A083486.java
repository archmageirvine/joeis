package irvine.oeis.a083;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083486 Triangle read by rows in which the n-th row contains the smallest set of n distinct numbers beginning with n with a product which is a square.
 * @author Sean A. Irvine
 */
public class A083486 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;
  private long mA = 0;
  private FactorSequence mFactorSequence = null;

  @Override
  public Z next() {
    if (++mM > mN) {
      mA = ++mN;
      mM = 1;
      mFactorSequence = new FactorSequence();
      mFactorSequence.add(mA);
      return Z.valueOf(mA);
    }
    if (mM == mN) {
      // last term
      Jaguar.factor(mFactorSequence);
      Z prod = Z.ONE;
      for (final Z p : mFactorSequence.toZArray()) {
        if ((mFactorSequence.getExponent(p) & 1) == 1) {
          prod = prod.multiply(p);
        }
      }
      long k = 1;
      while (prod.multiply(k * k).compareTo(mA) <= 0) {
        ++k;
      }
      return prod.multiply(k * k);
    }
    mFactorSequence.add(++mA);
    return Z.valueOf(mA);
  }
}

