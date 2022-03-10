package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A055255 Number of even digits in 3^n.
 * @author Georg Fischer
 */
public class A055255 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    final int[] dcs = ZUtils.digitCounts(Z.THREE.pow(++mN));
    long sum = 0;
    for (int i = 0; i < 10; i += 2) {
      sum += dcs[i];
    }
    return Z.valueOf(sum);
  }
}
