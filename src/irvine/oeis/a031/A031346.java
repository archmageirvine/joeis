package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A031346 Multiplicative persistence: number of iterations of "multiply digits" needed to reach a number <code>&lt; 10</code>.
 * @author Sean A. Irvine
 */
public class A031346 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    long m = ++mN;
    long cnt = 0;
    while (m > 9) {
      ++cnt;
      m = ZUtils.digitProduct(m);
    }
    return Z.valueOf(cnt);
  }
}

