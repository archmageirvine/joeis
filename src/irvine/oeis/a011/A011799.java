package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011799 Maximal rank function rho(3,n).
 * @author Sean A. Irvine
 */
public class A011799 implements Sequence {

  // Conjectural

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).multiply(7).add(1).multiply(mN).divide2().add(3);
  }
}
