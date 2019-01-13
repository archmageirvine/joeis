package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a004.A004140;

/**
 * A006896.
 * @author Sean A. Irvine
 */
public class A006896 extends A004140 {

  @Override
  public Z next() {
    return super.next().add(1);
  }
}
