package irvine.oeis.a028;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028846 Numbers n such that product of digits of n is a power of 2.
 * @author Sean A. Irvine
 */
public class A028846 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long u = LongUtils.digitProduct(++mN);
      if (u != 0 && (u & (u - 1)) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
