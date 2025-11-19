package irvine.oeis.a388;

import java.util.Arrays;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A390421.
 * @author Sean A. Irvine
 */
public class A388004 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z[] v = new Z[mN];
    Arrays.fill(v, Z.ONE);
    for (int k = 2; k <= mN; ++k) {
      final Z s = Functions.SUM.z(v);
      final Z[] u = new Z[mN];
      for (int j = 0; j < mN; ++j) {
        u[j] = s.subtract(v[j]).subtract(j > 0 ? v[j - 1] : Z.ZERO).subtract(j + 1 < mN ? v[j + 1] : Z.ZERO);
      }
      v = u;
    }
    return Functions.SUM.z(v);
  }
}
