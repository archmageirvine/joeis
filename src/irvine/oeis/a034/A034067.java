package irvine.oeis.a034;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034067 Decimal part of a(n)^(1/2) starts with n so that a(n)&lt;a(n+1).
 * @author Sean A. Irvine
 */
public class A034067 implements Sequence {

  private long mN = -1;
  private long mT = 10;
  private Z mM = Z.valueOf(25);

  @Override
  public Z next() {
    if (++mN == mT) {
      mT *= 10L;
    }
    while (true) {
      mM = mM.add(1);
      if (!mM.isSquare()) {
        if (CR.valueOf(mM).sqrt().frac().multiply(mT).floor().longValueExact() == mN) {
          return mM;
        }
      }
    }
  }
}

