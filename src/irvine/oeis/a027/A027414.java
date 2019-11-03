package irvine.oeis.a027;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027414 G.f. for Moebius transform is <code>x * (1 + x) / (1 + x^4)</code>.
 * @author Sean A. Irvine
 */
public class A027414 implements Sequence {

  private static final long[] C = {1, 1, 0, 0, -1, -1, 0, 0};
  private long mN = 0;

  @Override
  public Z next() {
    long sum = 0;
    for (final Z d : Cheetah.factor(++mN).divisors()) {
      sum += C[(d.intValue() - 1) & 7];
    }
    return Z.valueOf(sum);
  }
}
