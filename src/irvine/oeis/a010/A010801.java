package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A010801 13th powers: a(n) = n^13.
 * @author Sean A. Irvine
 */
public class A010801 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(13);
  }
}
