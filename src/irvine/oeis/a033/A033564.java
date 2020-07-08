package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033564 <code>a(n+1) = a(n)</code> followed by <code>a(n)+1</code>.
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
