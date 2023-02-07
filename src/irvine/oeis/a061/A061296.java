package irvine.oeis.a061;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.a067.A067050;

/**
 * A061296 Row sums of A067050.
 * @author Sean A. Irvine
 */
public class A061296 extends A067050 {

  private int mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN, k -> super.next());
  }
}
