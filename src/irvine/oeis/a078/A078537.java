package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.a145.A145515;

/**
 * A078122.
 * @author Sean A. Irvine
 */
public class A078537 extends A145515 {

  private int mN = -1;

  @Override
  public Z next() {
    return t(++mN, 4);
  }
}

