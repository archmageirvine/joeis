package irvine.oeis.a076;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A076605.
 * @author Sean A. Irvine
 */
public class A076605 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    final Z[] p = Cheetah.factor(++mN * mN - 1).toZArray();
    return p[p.length - 1];
  }
}
