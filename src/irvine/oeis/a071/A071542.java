package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A071542 Number of steps to reach 0 starting with n and using the iterated process : x -&gt; x - (number of 1's in binary representation of x).
 * @author Sean A. Irvine
 */
public class A071542 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    long cnt = 0;
    long m = ++mN;
    while (m != 0) {
      ++cnt;
      m -= Long.bitCount(m);
    }
    return Z.valueOf(cnt);
  }
}
