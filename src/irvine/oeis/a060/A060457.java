package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060457 Number of solutions to y^2 + y = x^3 - x^2 modulo n.
 * @author Sean A. Irvine
 */
public class A060457 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long count = 0;
    for (long y = 0; y < mN; ++y) {
      final long a = y * y + y;
      for (long x = 0; x < mN; ++x) {
        if ((a - x * x * x + x * x) % mN == 0) {
          ++count;
        }
      }
    }
    return Z.valueOf(count);
  }
}
