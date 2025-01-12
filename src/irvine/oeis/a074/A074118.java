package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A074118 Largest power of 3 &lt;= 10^n.
 * @author Sean A. Irvine
 */
public class A074118 extends Sequence0 {

  private Z mMax = null;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mMax = mMax == null ? Z.ONE : mMax.multiply(10);
    Z t = mA;
    while (mA.compareTo(mMax) < 0) {
      t = mA;
      mA = mA.multiply(3);
    }
    return t;
  }
}
