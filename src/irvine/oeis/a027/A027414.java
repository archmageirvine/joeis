package irvine.oeis.a027;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A027414 G.f. for Moebius transform is x * (1 + x) / (1 + x^4).
 * @author Sean A. Irvine
 */
public class A027414 extends Sequence1 {

  private static final long[] C = {1, 1, 0, 0, -1, -1, 0, 0};
  private long mN = 0;

  @Override
  public Z next() {
    long sum = 0;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      sum += C[(d.intValue() - 1) & 7];
    }
    return Z.valueOf(sum);
  }
}
