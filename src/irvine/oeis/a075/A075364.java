package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070428.
 * @author Sean A. Irvine
 */
public class A075364 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(mN + 1).sqrt();
  }
}
