package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A036989 Read binary expansion of n from the right; keep track of the excess of 1's over 0's that have been seen so far; sequence gives 1 + maximum(excess of 1's over 0's).
 * @author Sean A. Irvine
 */
public class A036989 extends Sequence0 {

  private long mN = -1;

  private int excess(long n) {
    int s = 0;
    int max = 0;
    while (n != 0) {
      s += 1 - 2 * (n & 1);
      if (s < max) {
        max = s;
      }
      n >>>= 1;
    }
    return -max;
  }

  @Override
  public Z next() {
    return Z.valueOf(excess(++mN) + 1);
  }
}
