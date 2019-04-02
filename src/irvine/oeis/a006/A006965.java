package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a038.A038060;

/**
 * A006965 Number of directed trees with n nodes.
 * @author Sean A. Irvine
 */
public class A006965 extends A038060 {

  {
    super.next(); // skip 0th
  }

  @Override
  public Z next() {
    return super.next().divide(3);
  }
}
