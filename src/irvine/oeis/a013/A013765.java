package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013765.
 * @author Sean A. Irvine
 */
public class A013765 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(361) : mA.multiply(6859);
    return mA;
  }
}
