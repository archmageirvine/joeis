package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074782 Let b(1)=b(2)=1, b(k) = (2^b(k-1)+2^b(k-2)) (mod k); sequence gives values of n such that b(n)=0.
 * @author Sean A. Irvine
 */
public class A074782 extends Sequence1 {

  private Z mA = Z.ONE;
  private Z mB = Z.ONE;
  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      final Z t = Z.TWO.pow(mA).add(Z.TWO.pow(mB)).modZ(++mN);
      mA = mB;
      mB = t;
      if (t.isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
