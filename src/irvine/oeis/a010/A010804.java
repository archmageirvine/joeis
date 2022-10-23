package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A010804 16th powers: a(n) = n^16.
 * @author Sean A. Irvine
 */
public class A010804 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(16);
  }
}
