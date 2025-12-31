package irvine.oeis.a391;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A391537 allocated for Ruediger Jehn.
 * @author Sean A. Irvine
 */
public class A391537 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(mN * ++mN / 4 + mN);
  }
}
