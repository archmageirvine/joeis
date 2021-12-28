package irvine.oeis.a053;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053475 1 + the number of iterations of A051953 (Euler-cototient) function needed to reach 0, starting at n.
 * @author Sean A. Irvine
 */
public class A053475 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    long cnt = 2;
    long n = ++mN;
    while (n != 1) {
      n -= LongUtils.phi(n);
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}

