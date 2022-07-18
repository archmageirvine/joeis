package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.a236.A236542;

/**
 * A058010.
 * @author Sean A. Irvine
 */
public class A058010 extends A236542 {

  private int mN = 0;

  @Override
  public Z next() {
    return get(++mN, mN);
  }
}
