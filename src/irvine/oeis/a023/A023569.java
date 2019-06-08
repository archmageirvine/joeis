package irvine.oeis.a023;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023569.
 * @author Sean A. Irvine
 */
public class A023569 extends A000040 {

  {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    final Z[] p = Cheetah.factor(super.next().subtract(3)).toZArray();
    return p[p.length - 1];
  }
}
