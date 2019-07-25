package irvine.oeis.a024;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;

/**
 * A024818 <code>a(n) = floor(tan m)</code>, where m is the least positive integer such that <code>floor(tan m) &gt; floor(tan k)</code> for k <code>= 0,1,...,m-1</code>.
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
