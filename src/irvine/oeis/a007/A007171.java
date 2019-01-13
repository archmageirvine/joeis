package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a003.A003169;

/**
 * A007171.
 * @author Sean A. Irvine
 */
public class A007171 extends A007170 {

  private final A003169 mP = new A003169();
  private final A007165 mH = new A007165();
  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      super.next();
      return Z.ONE;
    }
    return mP.next().add(mH.next()).divide2().add(super.next());
  }
}
