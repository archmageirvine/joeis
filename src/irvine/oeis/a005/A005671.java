package irvine.oeis.a005;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.a002.A002386;

/**
 * A005671.
 * @author Sean A. Irvine
 */
public class A005671 extends A002386 {

  private long mN = -1;

  @Override
  public Z next() {
    final CR tan = ComputableReals.SINGLETON.tan(CR.valueOf(++mN));
    return tan.multiply(tan).add(CR.HALF).floor(32);
  }
}

