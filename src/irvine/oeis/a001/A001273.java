package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001273 Smallest number that takes n steps to reach 1 under iteration of <code>sum-of-squares-of-digits</code> map <code>(=</code> smallest "happy number" of height <code>n)</code>.
 * @author Sean A. Irvine
 */
public class A001273 implements Sequence {

  private static final long[] SMALL = {1, 10, 13, 23, 19, 7, 356, 78999};

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN < SMALL.length) {
      return Z.valueOf(SMALL[mN]);
    } else if (mN == 8) {
      return Z.TEN.pow(973).multiply(3789).subtract(1);
    } else {
      throw new UnsupportedOperationException();
    }
  }
}
