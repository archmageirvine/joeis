package irvine.oeis.a006;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006526 Egyptian fraction for <code>1/e</code>.
 * @author Sean A. Irvine
 */
public class A006526 implements Sequence {

  private CR mX = null;

  @Override
  public Z next() {
    mX = mX == null ? CR.E.inverse() : mX.subtract(CR.valueOf(mX.inverse().ceil()).inverse());
    return mX.inverse().ceil();
  }
}
