package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001855.
 * @author Sean A. Irvine
 */
public class A001855 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    long s = 1;
    while (s < mN) {
      s <<= 1;
      ++k;
    }
    return Z.valueOf(1 + mN * k - s);
  }
}
