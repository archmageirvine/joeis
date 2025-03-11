package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A075847 Difference between n^2 and the largest cube &lt;= n^2.
 * @author Sean A. Irvine
 */
public class A075847 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final Z s = Z.valueOf(++mN).square();
    return s.subtract(s.root(3).pow(3));
  }
}

