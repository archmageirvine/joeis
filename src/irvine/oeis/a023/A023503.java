package irvine.oeis.a023;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023503.
 * @author Sean A. Irvine
 */
public class A023503 extends A000040 {

  {
    super.next();
  }

  @Override
  public Z next() {
    final Z[] t = Cheetah.factor(super.next().subtract(1)).toZArray();
    return t[t.length - 1];
  }
}
