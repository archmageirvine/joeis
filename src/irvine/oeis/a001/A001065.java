package irvine.oeis.a001;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001065.
 * @author Sean A. Irvine
 */
public class A001065 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Cheetah.factor(++mN).sigma().subtract(mN);
  }
}
