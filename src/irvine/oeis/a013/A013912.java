package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013912.
 * @author Sean A. Irvine
 */
public class A013912 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(13824) : mA.multiply(7962624);
    return mA;
  }
}
