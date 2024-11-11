package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073047 Least k such that x(k)=0 where x(1)=n and x(k)=k*floor(x(k-1)/k).
 * @author Sean A. Irvine
 */
public class A073047 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long x = ++mN;
    long k = 1;
    while (x != 0) {
      ++k;
      x = k * (x / k);
    }
    return Z.valueOf(k);
  }
}
