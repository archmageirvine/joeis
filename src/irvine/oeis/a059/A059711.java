package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059711 Smallest base in which n is a repdigit.
 * @author Sean A. Irvine
 */
public class A059711 implements Sequence {

  private long mN = -1;

  private boolean is(long n, final long base) {
    final long r = n % base;
    n /= base;
    while (n != 0) {
      if (n % base != r) {
        return false;
      }
      n /= base;
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    long base = 1;
    while (true) {
      ++base;
      if (is(mN, base)) {
        return Z.valueOf(base);
      }
    }
  }
}
