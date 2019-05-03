package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.a000.A000101;

/**
 * A008995 Increasing length runs of consecutive composite numbers (endpoints).
 * @author Sean A. Irvine
 */
public class A008995 extends A000101 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}

