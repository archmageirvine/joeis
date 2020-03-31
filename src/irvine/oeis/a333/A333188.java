package irvine.oeis.a333;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;

/**
 * A333188 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A333188 extends A333187 {

  private int mN = 0;

  @Override
  public Z next() {
    return ComputableReals.SINGLETON.csc(CR.valueOf(++mN).inverse()).shiftLeft(mN).floor().subtract(super.next());
  }
}

