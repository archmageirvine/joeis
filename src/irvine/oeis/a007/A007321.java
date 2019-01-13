package irvine.oeis.a007;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;

/**
 * A007321.
 * @author Sean A. Irvine
 */
public class A007321 extends A007320 {

  @Override
  protected Z juggler(final Z n) {
    final CR v = CR.valueOf(n);
    return n.isEven() ? v.sqrt().add(CR.HALF).floor(32) : ComputableReals.SINGLETON.pow(v, 3).sqrt().add(CR.HALF).floor(32);
  }
}
