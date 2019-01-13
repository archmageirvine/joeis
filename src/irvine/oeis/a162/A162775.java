package irvine.oeis.a162;

import irvine.math.z.Z;
import irvine.oeis.a141.A141042;

/**
 * A162775.
 * @author Sean A. Irvine
 */
public class A162775 extends A141042 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide(2);
  }
}
