package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014980 Start with 5. Multiply the two numbers closest to <code>n/2</code> to get the next number.
 * @author Sean A. Irvine
 */
public class A014980 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.FIVE : mA.divide2().multiply(mA.add(1).divide2());
    return mA;
  }
}
