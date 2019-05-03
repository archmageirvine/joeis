package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a000.A000203;

/**
 * A006352 Coefficients in expansion of Eisenstein series <code>E_2</code> (also called <code>E_1</code> or <code>G_2)</code>.
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

