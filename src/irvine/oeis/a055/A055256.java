package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A055256 Number of odd digits in 3^n.
 * @author Georg Fischer
 */
public class A055256 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    final int[] dcs = ZUtils.digitCounts(Z.THREE.pow(++mN));
    long sum = 0;
    for (int i = 1; i < 10; i += 2) {
      sum += dcs[i];
    }
    return Z.valueOf(sum);
  }
}
