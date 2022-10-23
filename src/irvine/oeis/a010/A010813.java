package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A010813 25th powers: a(n) = n^25.
 * @author Sean A. Irvine
 */
public class A010813 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(25);
  }
}
