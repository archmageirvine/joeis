package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a003.A003636;

/**
 * A006374.
 * @author Sean A. Irvine
 */
public class A006374 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    mN -= 4;
    return Z.valueOf(A003636.forms(mN).size());
  }
}
