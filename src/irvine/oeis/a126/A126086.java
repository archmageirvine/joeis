package irvine.oeis.a126;

import irvine.math.z.Z;
import irvine.oeis.a262.A262809;

/**
 * A126086 Number of paths from (0,0,0) to (n,n,n) such that at each step (i) at least one coordinate increases, (ii) no coordinate decreases, (iii) no coordinate increases by more than 1 and (iv) all coordinates are integers.
 * @author Sean A. Irvine
 */
public class A126086 extends A262809 {

  private int mN = -1;

  @Override
  public Z next() {
    return t(++mN, 3);
  }
}

