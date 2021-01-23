package irvine.oeis.a034;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A034054 Numbers with multiplicative digital root value 7.
 * @author Sean A. Irvine
 */
public class A034054 implements Sequence {

  private final TreeSet<Z> mA = new TreeSet<>();
  private int mN = -1;

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      ++mN;
      for (int k = 0; k <= mN; ++k) {
        mA.add(new Z(StringUtils.rep('1', k) + '7' + StringUtils.rep('1', mN - k)));
      }
    }
    return mA.pollFirst();
  }
}

