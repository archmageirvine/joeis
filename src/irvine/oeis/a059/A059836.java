package irvine.oeis.a059;

import irvine.math.group.IntegerField;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A059836 Triangle T(s,t), s&gt;=1, 1&lt;=t&lt;=s (see formula line).
 * @author Sean A. Irvine
 */
public class A059836 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;

  protected Z t(final int n, final int m) {
    if ((m & 1) == 0) {
      return IntegerField.SINGLETON.product(1, m / 2 - 1, k -> Z.valueOf(n - k).square()).multiply(n - m / 2);
    } else {
      return IntegerField.SINGLETON.product(1, m / 2, k -> Z.valueOf(n - k).square());
    }
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return t(mN, mM);
  }
}
