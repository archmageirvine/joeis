package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.a023.A023022;

/**
 * A055684 Number of different n-pointed stars.
 * @author Sean A. Irvine
 */
public class A055684 extends A023022 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
