package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A055254 Number of odd digits in 2^n.
 * @author Georg Fischer
 */
public class A055254 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    final int[] dcs = ZUtils.digitCounts(Z.ONE.shiftLeft(++mN));
    long sum = 0;
    for (int i = 1; i < 10; i += 2) {
      sum += dcs[i];
    }
    return Z.valueOf(sum);
  }
}
