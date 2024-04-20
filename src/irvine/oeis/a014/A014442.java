package irvine.oeis.a014;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A014442 Largest prime factor of n^2 + 1.
 * @author Sean A. Irvine
 */
public class A014442 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Functions.GPF.z(Z.valueOf(++mN).square().add(1));
  }
}

