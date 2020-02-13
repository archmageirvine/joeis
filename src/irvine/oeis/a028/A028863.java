package irvine.oeis.a028;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A028863.
 * @author Sean A. Irvine
 */
public class A028863 extends A000045 {

  @Override
  public Z next() {
    return ComputableReals.SINGLETON.cos(CR.valueOf(super.next())).floor();
  }
}
