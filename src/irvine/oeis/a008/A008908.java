package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.a006.A006577;

/**
 * A008908.
 * @author Sean A. Irvine
 */
public class A008908 extends A006577 {

  @Override
  public Z next() {
    return super.next().add(1);
  }
}
