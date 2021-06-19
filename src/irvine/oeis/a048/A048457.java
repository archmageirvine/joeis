package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a047.A047844;

/**
 * A048457 Last odd terms from generation 2 onwards.
 * @author Sean A. Irvine
 */
public class A048457 extends A047844 {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    long m = mN;
    while (get(++m, mN).isOdd()) {
      // do nothing
    }
    return get(mN, m - 1);
  }
}
