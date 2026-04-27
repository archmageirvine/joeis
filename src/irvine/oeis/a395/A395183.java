package irvine.oeis.a395;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;

/**
 * A395183 a(n) is the least positive integer k such that k*n has a decimal expansion with exactly two nonzero digits with one or more zeros between them and any number of trailing zeros. If no such number exists, then a(n) = 0.
 * @author Sean A. Irvine
 */
public class A395183 extends Sequence0 {

  // After Michael S. Branicky

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    final Sequence b = new Sequence0() {
      private long mL = 3;
      private long mD1 = 1;
      private long mI = 0;
      private long mD2 = 0;
      private Z mBase = Z.TEN.square();

      @Override
      public Z next() {
        if (++mD2 >= 10) {
          mD2 = 1;
          if (++mI >= mL - 2) {
            mI = 0;
            if (++mD1 >= 10) {
              mD1 = 1;
              ++mL;
            }
            mBase = Z.TEN.pow(mL - 1).multiply(mD1);
          }
        }
        return mBase.add(Z.TEN.pow(mI).multiply(mD2));
      }
    };
    while (true) {
      final Z t = b.next();
      if (t == null) {
        return Z.ZERO;
      }
      final Z[] qr = t.divideAndRemainder(mN);
      if (qr[1].isZero()) {
        return qr[0];
      }
    }
  }
}

