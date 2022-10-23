package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046079 Number of Pythagorean triangles with leg n.
 * @author Sean A. Irvine
 */
public class A046079 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final long s = mN * mN;
    return Jaguar.factor((mN & 1) == 0 ? s / 4 : s).sigma0().subtract(1).divide2();
  }
}

