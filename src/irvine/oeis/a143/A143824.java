package irvine.oeis.a143;

import irvine.math.z.Z;
import irvine.oeis.a382.A382397;

/**
 * A143824 Size of the largest subset {x(1),x(2),...,x(k)} of {1,2,...,n} with the property that all differences |x(i)-x(j)| are distinct.
 * @author Sean A. Irvine
 */
public class A143824 extends A382397 {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(f(++mN)[1]);
  }
}
