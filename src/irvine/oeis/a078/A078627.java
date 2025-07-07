package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078627 Write n in binary; repeatedly sum the "digits" until reaching 1; a(n) = 1 + number of steps required.
 * @author Sean A. Irvine
 */
public class A078627 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long m = ++mN;
    long cnt = 1;
    while (m != 1) {
      ++cnt;
      m = Long.bitCount(m);
    }
    return Z.valueOf(cnt);
  }
}

