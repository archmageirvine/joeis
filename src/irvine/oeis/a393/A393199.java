package irvine.oeis.a393;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence3;

/**
 * A393199 a(n) is the least m such that the base m expansion of n contains exactly two ones.
 * @author Sean A. Irvine
 */
public class A393199 extends Sequence3 {

  private long mN = 2;

  @Override
  public Z next() {
    ++mN;
    int m = 1;
    while (true) {
      if (ZUtils.digitCounts(mN, ++m)[1] == 2) {
        return Z.valueOf(m);
      }
    }
  }
}
