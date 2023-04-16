package irvine.oeis.a062;

import irvine.math.Mobius;
import irvine.math.z.Z;
import irvine.oeis.a023.A023022;

/**
 * A062963 Mu(n) * H(n) where H(n) is A023022.
 * @author Sean A. Irvine
 */
public class A062963 extends A023022 {

  private long mN = 2;
  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().multiply(Mobius.mobius(++mN));
  }
}

