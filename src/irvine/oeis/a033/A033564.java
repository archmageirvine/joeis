package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033564 a(n+1) = a(n) followed by a(n)+1.
 * @author Sean A. Irvine
 */
public class A033564 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : new Z(mA.toString() + mA.add(1));
    return mA;
  }
}
