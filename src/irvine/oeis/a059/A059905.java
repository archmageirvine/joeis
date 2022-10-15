package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059905 Index of first half of decomposition of integers into pairs based on A000695.
 * @author Sean A. Irvine
 */
public class A059905 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    long m = ++mN;
    long r = 0;
    long b = 1;
    while (m != 0) {
      if ((m & 1) == 1) {
        r |= b;
      }
      m >>>= 2;
      b <<= 1;
    }
    return Z.valueOf(r);
  }
}
