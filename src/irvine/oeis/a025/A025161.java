package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.a194.A194543;

/**
 * A025161.
 * @author Sean A. Irvine
 */
public class A025161 extends A194543 {

  private int mN = 0;

  @Override
  public Z next() {
    return t(++mN, 7);
  }
}
