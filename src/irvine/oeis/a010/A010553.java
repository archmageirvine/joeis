package irvine.oeis.a010;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.a000.A000005;

/**
 * A010553.
 * @author Sean A. Irvine
 */
public class A010553 extends A000005 {

  @Override
  public Z next() {
    return Z.valueOf(Cheetah.factor(super.next()).sigma0());
  }
}

