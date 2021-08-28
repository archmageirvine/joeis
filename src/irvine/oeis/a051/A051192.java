package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a050.A050186;

/**
 * A051192 T(n,7), array T as in A050186; a count of aperiodic binary words.
 * @author Sean A. Irvine
 */
public class A051192 extends A050186 {

  private long mN = 6;

  @Override
  public Z next() {
    return t(++mN, 7);
  }
}
