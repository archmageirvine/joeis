package irvine.oeis.a072;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A072607.
 * @author Sean A. Irvine
 */
public class A072625 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    return p.mod(CR.valueOf(p).log().ceil());
  }
}
