package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A062033 Binary expansion of n does not contain 1-bits at even positions. Integers whose base 4 representation consists of only 0's and 2s.
 * Integers whose base 4 representation consists of only 0&apos;s and 2s.
 * @author Georg Fischer
 */
public class A062033 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    int[] cnts = ZUtils.digitCounts(++mN, 4);
    while (cnts[1] != 0 || cnts[3] != 0) {
      cnts = ZUtils.digitCounts(++mN, 4);
    }
    return new Z(Long.toBinaryString(mN));
  }
}
