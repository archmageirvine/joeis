package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001178.
 * @author Sean A. Irvine
 */
public class A001178 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    int omega = 0;
    long pi = ++mN;
    while (true) {
      final long p = A001175.pisanoPeriod(pi);
      if (p == pi) {
        return Z.valueOf(omega);
      }
      pi = p;
      ++omega;
    }
  }
}
