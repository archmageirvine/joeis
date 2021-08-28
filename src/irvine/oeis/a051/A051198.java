package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a050.A050186;

/**
 * A051198 T(2n+5,n), array T as in A050186; a count of aperiodic binary words.
 * @author Sean A. Irvine
 */
public class A051198 extends A050186 {

  private long mN = -1;

  @Override
  public Z next() {
    return t(2 * ++mN + 5, mN);
  }
}
