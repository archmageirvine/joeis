package irvine.oeis.a059;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059795 Numbers n such that n^2 starts with the reverse of n.
 * @author Sean A. Irvine
 */
public class A059795 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (++mN % 10 != 0 && Z.valueOf(mN).square().toString().startsWith(String.valueOf(LongUtils.reverse(mN)))) {
        return Z.valueOf(mN);
      }
    }
  }
}
