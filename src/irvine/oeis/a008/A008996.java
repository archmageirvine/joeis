package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.a005.A005250;

/**
 * A008996 Increasing length runs of consecutive composite numbers (records).
 * @author Sean A. Irvine
 */
public class A008996 extends A005250 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}

