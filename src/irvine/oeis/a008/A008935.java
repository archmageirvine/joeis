package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008935 If <code>2n =</code> Sum <code>2^e(k)</code> then <code>a(n) =</code> Sum <code>e(k)^2</code>.
 * @author Sean A. Irvine
 */
public class A008935 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    long m = ++mN;
    long sum = 0;
    long k = 1;
    while (m != 0) {
      if ((m & 1) == 1) {
        sum += k * k;
      }
      ++k;
      m >>>= 1;
    }
    return Z.valueOf(sum);
  }
}
