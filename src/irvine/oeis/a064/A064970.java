package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a005.A005132;

/**
 * A064970 a(1)=1; thereafter, values of n for which r(n)-r(n-1) and r(n-1)-r(n-2) have the same sign, where r(n) = A005132(n).
 * @author Sean A. Irvine
 */
public class A064970 extends Sequence1 {

  private final Sequence mSeq = new A005132();
  private Z mA = mSeq.next();
  private Z mB = mSeq.next();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (++mN == 1) {
        return Z.ONE;
      }
      final Z r = mA;
      mA = mB;
      mB = mSeq.next();
      if (mB.subtract(mA).signum() == mA.subtract(r).signum()) {
        return Z.valueOf(mN);
      }
    }
  }
}

