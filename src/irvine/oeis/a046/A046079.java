package irvine.oeis.a046;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046079 Number of Pythagorean triangles with leg <code>n</code>.
 * @author Sean A. Irvine
 */
public class A046079 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final long s = mN * mN;
    return Cheetah.factor((mN & 1) == 0 ? s / 4 : s).sigma0().subtract(1).divide2();
  }
}

