package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081468 a(n) is the smallest multiple of n of the type k*n + k*(k+1)/2, i.e., the smallest sum (n+1) to (n+k) which is divisible by n.
 * @author Sean A. Irvine
 */
public class A081468 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long sum = 0;
    long k = mN;
    do {
      sum += ++k;
    } while (sum % mN != 0);
    return Z.valueOf(sum);
  }
}
