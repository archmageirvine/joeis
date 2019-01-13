package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a000.A000041;

/**
 * A002865.
 * @author Sean A. Irvine
 */
public class A002865 extends A000041 {

  private Z mP = null;

  @Override
  public Z next() {
    final Z t = mP;
    mP = super.next();
    return t == null ? Z.ONE : mP.subtract(t);
  }
}
