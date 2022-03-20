package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055436 a(n) = concatenation of n^2 and n.
 * @author Sean A. Irvine
 */
public class A055436 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return new Z(Z.valueOf(++mN).square().toString() + mN);
  }
}
