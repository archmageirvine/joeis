package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.a006.A006964;

/**
 * A038059.
 * @author Sean A. Irvine
 */
public class A038059 extends A006964 {

  @Override
  public Z next() {
    return super.next().multiply(3);
  }
}
