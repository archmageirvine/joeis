package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007961 n written in base where place values are positive squares.
 * @author Sean A. Irvine
 */
public class A007961 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    long v = ++mN;
    if (mM * mM < mN) {
      ++mM;
    }
    long m = mM;
    final StringBuilder sb = new StringBuilder();
    while (m != 0) {
      final long s = m * m;
      final long d = v / s;
      sb.append(d);
      v -= d * s;
      --m;
    }
    return new Z(sb);
  }
}
