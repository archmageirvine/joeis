package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a001.A001570;

/**
 * A006051.
 * @author Sean A. Irvine
 */
public class A006051 extends A001570 {

  @Override
  public Z next() {
    return super.next().square();
  }
}

