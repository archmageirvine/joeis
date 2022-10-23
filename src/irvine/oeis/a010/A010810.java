package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A010810 22nd powers: a(n) = n^22.
 * @author Sean A. Irvine
 */
public class A010810 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(22);
  }
}
