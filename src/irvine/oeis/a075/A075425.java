package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A023108.
 * @author Sean A. Irvine
 */
public class A075425 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long m = ++mN;
    long cnt = 0;
    while (m != 1) {
      m = Functions.RAD.l(m) - 1;
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}
