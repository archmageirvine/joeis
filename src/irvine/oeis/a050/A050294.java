package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A050294 Maximum cardinality of a 3-fold-free subset of {1, 2, ..., n}.
 * @author Sean A. Irvine
 */
public class A050294 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long m = ++mN;
    long sum = 3L * mN;
    boolean sign = false;
    while (m != 0) {
      sign = !sign;
      final long r = m % 3;
      sum += sign ? r : - r;
      m /= 3;
    }
    return Z.valueOf(sum / 4);
  }
}

