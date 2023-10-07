package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066286.
 * @author Sean A. Irvine
 */
public class A066298 extends Sequence1 {

  private static final Z Z100 = Z.valueOf(100);
  private long mN = 0;

  @Override
  public Z next() {
    return Z.TEN.modPow(Z100, Z.valueOf(++mN));
  }
}

