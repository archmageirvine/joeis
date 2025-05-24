package irvine.oeis.a384;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A383940.
 * @author Sean A. Irvine
 */
public class A384293 extends Sequence1 {

  private long mS = 1;

  @Override
  public Z next() {
    final Z res = Z.valueOf(mS);
    mS = (214013 * (mS & 0xFFFF) + 13523655) & 0xFFFFFF;
    return res;
  }
}
