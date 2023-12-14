package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A067355 Numbers n such that prime(n+3)-(n+3)*tau(n+3)=prime(n-3)-(n-3)*tau(n-3) where tau(n) is the number of divisors of n A000005(n).
 * @author Sean A. Irvine
 */
public class A067355 extends A000040 {

  private final int mLo;
  private final int mL;
  private final Z[] mP;
  private final Z[] mS;
  private long mN = 0;

  protected A067355(final int lo, final int hi) {
    mLo = lo;
    final int step = hi - lo;
    mL = step - 1;
    mP = new Z[mL + 1];
    mS = new Z[mL + 1];
    for (int k = 0; k < mS.length; ++k) {
      mP[k] = super.next();
      mS[k] = Jaguar.factor(k + 1).sigma0().multiply(k + 1);
      ++mN;
    }
  }

  /** Construct the sequence. */
  public A067355() {
    this(-3, 3);
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = mP[0];
      System.arraycopy(mP, 1, mP, 0, mP.length - 1);
      mP[mL] = super.next();
      final Z s = mS[0];
      System.arraycopy(mS, 1, mS, 0, mS.length - 1);
      mS[mL] = Jaguar.factor(++mN).sigma0().multiply(mN);
      if (mP[mL].subtract(mS[mL]).equals(p.subtract(s))) {
        return Z.valueOf(mN + mLo);
      }
    }
  }
}

