package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.a063.A063841;

/**
 * A004102.
 * @author Sean A. Irvine
 */
public class A004102 extends A063841 {

  private int mN = -1;

  @Override
  public Z next() {
    return t(++mN, 2);
  }
}

