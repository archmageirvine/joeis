package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049782 a(n) = (0! + 1! + ... + (n-1)!) mod n.
 * @author Sean A. Irvine
 */
public class A049782 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    long sum = 1 % ++mN; // 0!
    for (long k = 1, f = 1; f != 0 && k < mN; f *= ++k, f %= mN) {
      sum += f;
      sum %= mN;
    }
    return Z.valueOf(sum);
  }
}
