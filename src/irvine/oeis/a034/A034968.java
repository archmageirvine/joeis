package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034968 Minimal number of factorials that add to n.
 * @author Sean A. Irvine
 */
public class A034968 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    long s = ++mN;
    for (long k = 2, f = 2; f <= mN; f *= ++k) {
      s -= (k - 1) * (mN / f);
    }
    return Z.valueOf(s);
  }
}
