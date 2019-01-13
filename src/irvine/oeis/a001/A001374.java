package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.a004.A004105;

/**
 * A001374.
 * @author Sean A. Irvine
 */
public class A001374 extends A004105 {

  {
    super.next();
  }

  @Override
  protected Z base() {
    return Z.FOUR;
  }
}

