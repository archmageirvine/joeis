package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a000.A000203;

/**
 * A006352 Coefficients in expansion of Eisenstein series E_2 (also called E_1 or G_2).
 * @author Sean A. Irvine
 */
public class A006352 extends A000203 {

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ONE;
    }
    return super.next().multiply(-24);
  }
}

