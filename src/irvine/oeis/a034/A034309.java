package irvine.oeis.a034;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A034309 Decimal part of a(n)^(1/3) starts with reversal of its integer part: first term of runs.
 * @author Sean A. Irvine
 */
public class A034309 extends Sequence0 {

  private boolean mStartOfRun = true;
  private Z mN = Z.TEN;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final CR s = ComputableReals.SINGLETON.pow(CR.valueOf(mN), CR.ONE_THIRD);
      final Z f = s.floor();
      final Z r = Functions.REVERSE.z(f);
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

