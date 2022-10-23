package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A057946 Bad hexadecimal notation for n: write n in hexadecimal notation, replacing digit ten with "10", digit eleven with "11", ... and digit fifteen with "15".
 * @author Sean A. Irvine
 */
public class A057946 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    long m = ++mN;
    if (m == 0) {
      return Z.ZERO;
    }
    final StringBuilder sb = new StringBuilder();
    while (m != 0) {
      sb.insert(0, m & 0xF);
      m >>>= 4;
    }
    return new Z(sb);
  }
}
