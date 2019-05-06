package irvine.oeis.a006;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006525 Denominators of greedy Egyptian fraction for e <code>- 2</code>.
 * @author Sean A. Irvine
 */
public class A006525 implements Sequence {

  private CR mX = null;

  @Override
  public Z next() {
    mX = mX == null ? CR.E.subtract(CR.TWO) : mX.subtract(CR.valueOf(mX.inverse().ceil()).inverse());
    return mX.inverse().ceil();
  }
}
