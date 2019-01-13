package irvine.oeis.a006;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006526.
 * @author Sean A. Irvine
 */
public class A006526 implements Sequence {

  // Egyptian fraction

  private CR mX = null;

  @Override
  public Z next() {
    mX = mX == null ? CR.E.inverse() : mX.subtract(CR.valueOf(mX.inverse().ceil(32)).inverse());
    return mX.inverse().ceil(32);
  }
}
