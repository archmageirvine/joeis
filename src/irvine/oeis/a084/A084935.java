package irvine.oeis.a084;

import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A084935 Diagonal sums of the array T in A084934.
 * @author Sean A. Irvine
 */
public class A084935 extends A084934 {

  private long mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN, k -> super.next());
  }
}

