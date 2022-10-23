package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A010808 20th powers: a(n) = n^20.
 * @author Sean A. Irvine
 */
public class A010808 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(20);
  }
}
