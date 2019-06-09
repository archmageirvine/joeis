package irvine.oeis.a023;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023594.
 * @author Sean A. Irvine
 */
public class A023594 extends A000040 {

  @Override
  public Z next() {
    return A023507.sum(Cheetah.factor(super.next().multiply2().add(1)).toZArray());
  }
}
