package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a004.A004200;

/**
 * A006464.
 * @author Sean A. Irvine
 */
public class A006464 extends A004200 {

  @Override
  public Z next() {
    final Z s = super.next();
    return s.add(s.signum());
  }
}
