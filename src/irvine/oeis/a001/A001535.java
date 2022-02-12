package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001535 a(n) = (10n+1)*(10n+9).
 * @author Sean A. Irvine
 */
public class A001535 implements Sequence {

  private long mN = -9;

  @Override
  public Z next() {
    mN += 10;
    return Z.valueOf(mN).multiply(mN + 8);
  }
}
