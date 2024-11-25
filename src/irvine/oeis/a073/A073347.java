package irvine.oeis.a073;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072950.
 * @author Sean A. Irvine
 */
public class A073347 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      CR sum = CR.valueOf(mA).sqrt().inverse();
      while (sum.compareTo(CR.PI) <= 0) {
        mA = mA.add(1);
        sum = sum.add(CR.valueOf(mA).sqrt().inverse());
      }
    }
    return mA;
  }
}

