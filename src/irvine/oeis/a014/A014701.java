package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014701 Number of multiplications to compute n-th power by the Chandah-sutra method .
 * @author Sean A. Irvine
 */
public class A014701 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    long m = ++mN;
    long c = 0;
    while (m != 1) {
      m = (m & 1) == 0 ? m >>> 1 : m - 1;
      ++c;
    }
    return Z.valueOf(c);
  }
}

