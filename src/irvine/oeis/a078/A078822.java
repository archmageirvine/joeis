package irvine.oeis.a078;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A078800.
 * @author Sean A. Irvine
 */
public class A078822 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    long m = ++mN;
    final HashSet<Long> seen = new HashSet<>();
    do {
      long k = 0;
      while (k <= m) {
        k <<= 1;
        k += 1;
        seen.add(m & k);
      }
      m >>>= 1;
    } while (m != 0);
    return Z.valueOf(seen.size());
  }
}
