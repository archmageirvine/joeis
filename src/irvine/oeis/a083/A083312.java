package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083312 Largest integer m such that 1+2+...+m divides n.
 * @author Sean A. Irvine
 */
public class A083312 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long s = 1;
    long k = 1;
    long m = 1;
    while (s < mN) {
      s += ++k;
      if (mN % s == 0) {
        m = k;
      }
    }
    return Z.valueOf(m);
  }
}
