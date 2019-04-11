package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001044 <code>a(n) = (n!)^2</code>.
 * @author Sean A. Irvine
 */
public class A001044 implements Sequence {

  private Z mF = null;
  private long mN = 0;

  @Override
  public Z next() {
    if (mF == null) {
      mF = Z.ONE;
    } else {
      mF = mF.multiply(Z.valueOf(++mN).square());
    }
    return mF;
  }
}
