package irvine.oeis.a060;

import irvine.math.z.Z;

/**
 * A060468 Number of fair distributions (equal sum) of the integers {1,..,4n} between A and B = number of solutions to the equation {+-1 +-2 +- 3 ... +-4*n = 0}.
 * @author Sean A. Irvine
 */
public class A060468 extends A060005 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().multiply2();
  }
}
