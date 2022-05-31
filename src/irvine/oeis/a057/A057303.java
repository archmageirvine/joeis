package irvine.oeis.a057;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057303 Numbers n such that the number of distinct digits in n is a digit of n.
 * @author Sean A. Irvine
 */
public class A057303 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final int syndrome = LongUtils.syndrome(++mN);
      if ((syndrome & (1 << Long.bitCount(syndrome))) != 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
