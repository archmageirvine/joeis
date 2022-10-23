package irvine.oeis.a034;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A034308 Decimal part of a(n)^(1/2) starts with reversal of its integer part: first term of runs.
 * @author Sean A. Irvine
 */
public class A034308 extends Sequence0 {

  private boolean mStartOfRun = true;
  private Z mN = Z.FOUR;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (!mN.isSquare()) {
        final CR s = CR.valueOf(mN).sqrt();
        final Z f = s.floor();
        final Z r = ZUtils.reverse(f);
        final int len = f.toString().length();
        if (s.frac().multiply(Z.TEN.pow(len)).floor().equals(r)) {
          if (mStartOfRun) {
            mStartOfRun = false;
            return mN;
          }
        } else {
          mStartOfRun = true;
        }
      }
    }
  }
}

