package irvine.oeis.a109;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A109733 Sequence is its own base-10 ASCII representation.
 * @author Sean A. Irvine
 */
public class A109733 extends Sequence1 {

  // After David Wilson and David L. Applegate

  private long mN = 0;

  private int f(final long nn) {
    final long n = nn - 1;
    if (n == 0) {
      return 53;
    }
    final int k = f(n / 2 + 1);
    if ((n & 1) == 0) {
      return k < 50 ? 52 : 53;
    } else {
      return k < 50 ? k + 8 : k - 2;
    }
  }

  @Override
  public Z next() {
    return Z.valueOf(f(++mN));
  }
}
