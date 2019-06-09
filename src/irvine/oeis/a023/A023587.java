package irvine.oeis.a023;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023587.
 * @author Sean A. Irvine
 */
public class A023587 extends A000040 {

  @Override
  public Z next() {
    return A023507.sum(Cheetah.factor(super.next().multiply2().subtract(1)).toZArray());
  }
}
