package irvine.oeis.a037;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A037464.
 * @author Sean A. Irvine
 */
public class A037464 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    mN += 2;
    final Z[] p = Cheetah.factor(mN * mN - 1).toZArray();
    return p[p.length - 1];
  }
}
