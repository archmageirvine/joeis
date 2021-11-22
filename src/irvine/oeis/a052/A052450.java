package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.a006.A006785;

/**
 * A052450 Number of n-node simple graphs having clique number 2.
 * @author Sean A. Irvine
 */
public class A052450 extends A006785 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
