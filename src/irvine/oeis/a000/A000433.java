package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000433 n written in base where place values are positive cubes.
 * @author Sean A. Irvine
 */
public class A000433 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    final StringBuilder sb = new StringBuilder();
    long rootBase = 1;
    long n = ++mN;
    do {
      ++rootBase;
    } while (rootBase * rootBase * rootBase <= n);
    while (--rootBase > 0) {
      final long base = rootBase * rootBase * rootBase;
      sb.append(n / base);
      n = n % base;
    }
    return new Z(sb);
  }
}
