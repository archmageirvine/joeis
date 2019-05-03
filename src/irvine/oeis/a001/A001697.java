package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001697 <code>a(n+1) = a(n)(a(0) +</code> ... <code>+ a(n))</code>.
 * @author Sean A. Irvine
 */
public class A001697 implements Sequence {

  private Z mA = null;
  private Z mS = Z.ONE;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      mA = mS.multiply(mA);
      mS = mS.add(mA);
    }
    return mA;
  }
}
