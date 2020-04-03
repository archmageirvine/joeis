package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030474 n does not have the property that all even digits occur together and all odd digits occur together.
 * @author Sean A. Irvine
 */
public class A030474 implements Sequence {

  private long mN = 100;

  static boolean isMixed(long m) {
    final long side = m & 1;
    do {
      m /= 10;
    } while (m != 0 && (m & 1) == side);
    if (m == 0) {
      return false;
    }
    do {
      m /= 10;
    } while (m != 0 && (m & 1) != side);
    return m != 0;
  }

  @Override
  public Z next() {
    while (true) {
      if (isMixed(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
