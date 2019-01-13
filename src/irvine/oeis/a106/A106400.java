package irvine.oeis.a106;

import irvine.math.z.Z;
import irvine.oeis.a010.A010060;

/**
 * A106400.
 * @author Sean A. Irvine
 */
public class A106400 extends A010060 {

  @Override
  public Z next() {
    return super.next().signum() == 0 ? Z.ONE : Z.NEG_ONE;
  }
}

