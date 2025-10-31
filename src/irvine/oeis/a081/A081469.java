package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081469 a(n) = A081468(n)/n.
 * @author Sean A. Irvine
 */
public class A081469 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long sum = 0;
    long k = mN;
    do {
      sum += ++k;
    } while (sum % mN != 0);
    return Z.valueOf(sum / mN);
  }
}
