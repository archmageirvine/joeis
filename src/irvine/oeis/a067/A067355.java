package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A067355 Numbers k such that prime(k+3)-(k+3)*tau(k+3) = prime(k-3)-(k-3)*tau(k-3) where tau(k) = A000005(k) is the number of divisors of k.
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
      mS[k] = Functions.SIGMA0.z(k + 1).multiply(k + 1);
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
      mS[mL] = Functions.SIGMA0.z(++mN).multiply(mN);
      if (mP[mL].subtract(mS[mL]).equals(p.subtract(s))) {
        return Z.valueOf(mN + mLo);
      }
    }
  }
}

