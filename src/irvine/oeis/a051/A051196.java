package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a050.A050186;

/**
 * A051196 T(2n+3,n), array T as in A050186; a count of aperiodic binary words.
 * @author Sean A. Irvine
 */
public class A051196 extends A050186 {

  private long mN = -1;

  @Override
  public Z next() {
    return t(2 * ++mN + 3, mN);
  }
}
