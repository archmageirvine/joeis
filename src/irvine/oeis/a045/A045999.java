package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A045999 Length of n-th term of binary Gleichniszahlen-Reihe (BGR) sequence A045998.
 * @author Sean A. Irvine
 */
public class A045999 extends Sequence0 {

  private String mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = "1";
    } else {
      mA = A045998.lookAndSayMod2(mA);
    }
    return Z.valueOf(mA.length());
  }
}
