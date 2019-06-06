package irvine.oeis.a307;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A307877 Number of ways of partitioning the set of the first n positive squares into two subsets whose sums differ at most by 1.
 * @author Sean A. Irvine
 */
public class A307877 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf((++mN - 10 % mN) % mN);
  }
}
