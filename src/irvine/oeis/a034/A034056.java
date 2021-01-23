package irvine.oeis.a034;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A034056 Numbers with multiplicative digital root value 9.
 * @author Sean A. Irvine
 */
public class A034056 implements Sequence {

  private final TreeSet<Z> mA = new TreeSet<>();
  private int mN = -1;

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      ++mN;
      for (int k = 0; k <= mN; ++k) {
        mA.add(new Z(StringUtils.rep('1', k) + '9' + StringUtils.rep('1', mN - k)));
        for (int j = k + 1; j <= mN; ++j) {
          mA.add(new Z(StringUtils.rep('1', k) + '3' + StringUtils.rep('1', j - k - 1) + '3' + StringUtils.rep('1', mN - j)));
        }
      }
    }
    return mA.pollFirst();
  }
}

