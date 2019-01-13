package irvine.oeis.a016;

import irvine.math.z.Z;

/**
 * A016048.
 * @author Sean A. Irvine
 */
public class A016048 extends A016047 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide2().divide(mP);
  }
}
