package irvine.oeis.a384;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A384293 Consecutive internal states of the pseudo-random number generator (214013*(s mod 2^16)+13523655) mod 2^24 when started at s=1.
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
