package irvine.oeis.a024;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;

/**
 * A024818.
 * @author Sean A. Irvine
 */
public class A024818 extends A024814 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return ComputableReals.SINGLETON.tan(CR.valueOf(super.next())).floor();
  }
}
