package irvine.oeis.a394;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394525 allocated for Naoki Azuma.
 * @author Sean A. Irvine
 */
public class A394525 extends Sequence1 {

  private long mN = 0;

  private long step(final long x) {
    if (x > 1 && (x & 1) == 1) {
      return (x - 1) / 2;
    }
    if (x > 4 && (x & 3) == 0) {
      return (x - 4) / 4;
    }
    return -1;
  }

  @Override
  public Z next() {
    long k = ++mN;
    long count = 1;
    while (true) {
      k = step(k);
      if (k == -1) {
        return Z.valueOf(count);
      }
      ++count;
    }
  }
}
