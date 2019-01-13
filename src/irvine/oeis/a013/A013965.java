package irvine.oeis.a013;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013965.
 * @author Sean A. Irvine
 */
public class A013965 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Cheetah.factor(++mN).sigma(17);
  }
}
