package irvine.oeis.a000;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000495.
 * @author Sean A. Irvine
 */
public class A000495 implements Sequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private long mN = -1;

  @Override
  public Z next() {
    return REALS.add(REALS.sinh(CR.valueOf(++mN)), CR.HALF).floor(32);
  }
}
