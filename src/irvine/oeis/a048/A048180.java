package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a001.A001430;

/**
 * A048180.
 * @author Sean A. Irvine
 */
public class A048180 extends A001430 {

  {
    super.next();
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return numberLinearGraphs(++mN, mN + 2);
  }
}
