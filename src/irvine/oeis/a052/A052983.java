package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A052983 Least multiple of n consisting of a succession of 1's followed by a succession of 0's.
 * @author Sean A. Irvine
 */
public class A052983 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    int length = 1;
    while (true) {
      ++length;
      for (int ones = 1; ones < length; ++ones) {
        final Z t = new Z(StringUtils.rep('1', ones) + StringUtils.rep('0', length - ones));
        if (t.mod(mN) == 0) {
          return t;
        }
      }
    }
  }
}

