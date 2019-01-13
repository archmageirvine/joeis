package irvine.oeis.a001;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001467.
 * @author Sean A. Irvine
 */
public class A001467 implements Sequence {

  private CR mX = CR.PI;

  private Z round(final CR v) {
    return v.add(CR.HALF).floor(32);
  }

  @Override
  public Z next() {
    final Z s;
    if (mX.compareTo(CR.ONE) >= 0) {
      s = Z.ONE;
    } else {
      s = round(mX.inverse());
    }
    mX = mX.subtract(CR.valueOf(s).inverse());
    return s;
  }
}
