package irvine.oeis.a065;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065152 Cototient(totient(n)) - totient(cototient(n)).
 * @author Sean A. Irvine
 */
public class A065152 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z phi = Functions.PHI.z(++mN);
    return phi.subtract(Functions.PHI.z(phi)).subtract(Functions.PHI.z(mN - phi.longValueExact()));
  }
}

