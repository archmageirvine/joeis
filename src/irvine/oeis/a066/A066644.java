package irvine.oeis.a066;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066644 a(n) = floor(surface area of a sphere with radius n).
 * @author Sean A. Irvine
 */
public class A066644 extends Sequence1 {

  private static final CR PI4 = CR.PI.multiply(4);
  private long mN = 0;

  @Override
  public Z next() {
    return PI4.multiply(++mN * mN).floor();
  }
}
