package irvine.oeis.a084;

import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A084411 Row sums of triangle A084408.
 * @author Sean A. Irvine
 */
public class A084411 extends A084408 {

  private long mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN, k -> super.next());
  }
}
