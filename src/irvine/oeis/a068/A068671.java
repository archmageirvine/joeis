package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068671 Define f(n,k) = floor[n/k] and a(n) = right concatenation of f(n,k) for k = 1 to int[(n+1)/2] or until one arrives at a 1.
 * @author Sean A. Irvine
 */
public class A068671 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final StringBuilder sb = new StringBuilder();
    sb.append(mN);
    long k = 1;
    long t = mN;
    while (t > 1) {
      t = mN / ++k;
      sb.append(t);
    }
    return new Z(sb);
  }
}
