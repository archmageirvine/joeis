package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A010812 24th powers: a(n) = n^24.
 * @author Sean A. Irvine
 */
public class A010812 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(24);
  }
}
