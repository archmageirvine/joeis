package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010037.
 * @author Sean A. Irvine
 */
public class A010037 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(533360) : mA.add(1968751);
    return mA;
  }
}
