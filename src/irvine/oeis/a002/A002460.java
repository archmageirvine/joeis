package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.cr.CR;

/**
 * A002460.
 * @author Sean A. Irvine
 */
public class A002460 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return CR.valueOf(++mN).ei().add(CR.HALF).floor(32);
  }
}
