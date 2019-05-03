package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a106.A106400;

/**
 * A005599 Running sum of every third term in the <code>{+1,-1}-version</code> of Thue-Morse sequence <code>A010060</code>.
 * @author Sean A. Irvine
 */
public class A005599 extends A106400 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ZERO;
    } else {
      mA = mA.add(super.next());
      super.next();
      super.next();
    }
    return mA;
  }
}

