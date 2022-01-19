package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a004.A004514;

/**
 * A053985 Replace 2^k with (-2)^k in binary expansion of n.
 * @author Sean A. Irvine
 */
public class A053985 extends A004514 {

  @Override
  public Z next() {
    return super.next().subtract(mN);
  }
}
