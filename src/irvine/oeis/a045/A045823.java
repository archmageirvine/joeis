package irvine.oeis.a045;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045823 a(n) = sigma_3(2*n+1).
 * @author Sean A. Irvine
 */
public class A045823 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    mN += 2;
    return Cheetah.factor(mN).sigma(3);
  }
}

