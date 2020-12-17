package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A037205 a(n) = (n+1)^n - 1.
 * @author Sean A. Irvine
 */
public class A037205 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN + 1).pow(mN).subtract(1);
  }
}
