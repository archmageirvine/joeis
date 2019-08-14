package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.a012.A012125;

/**
 * A025175.
 * @author Sean A. Irvine
 */
public class A025175 extends A012125 {

  private long mN = 1;
  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().multiply2().divide(++mN);
  }
}
