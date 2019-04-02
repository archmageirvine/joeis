package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.a126.A126067;

/**
 * A003069 Number of n-node digraphs with same converse as complement.
 * @author Sean A. Irvine
 */
public class A003069 extends A126067 {

  private int mN = 0;

  @Override
  public Z next() {
    return i(++mN).apply(0, 1).toZ();
  }
}
