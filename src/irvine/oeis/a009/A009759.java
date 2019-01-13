package irvine.oeis.a009;

import irvine.math.z.Z;
import irvine.oeis.a001.A001652;

/**
 * A009759.
 * @author Sean A. Irvine
 */
public class A009759 extends A001652 {

  @Override
  public Z next() {
    return super.next().subtract(3);
  }
}
