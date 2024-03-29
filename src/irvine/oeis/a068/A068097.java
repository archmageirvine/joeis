package irvine.oeis.a068;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068097 a(1) = 1; a(n+1) = smallest triangular numbers starting with a(n).
 * @author Sean A. Irvine
 */
public class A068097 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else if (Z.ONE.equals(mA)) {
      mA = Z.TEN;
    } else {
      final Z lgf = CR.valueOf(mA).log10().floor();
      final Z s = Z.TEN.pow(lgf).multiply(8).multiply(mA).add(1).sqrt();
      final Z f = s.add(1).divide2();
      mA = f.multiply(f.add(1)).add(1).divide2();
    }
    return mA;
  }
}

