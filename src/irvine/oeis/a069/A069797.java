package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069797 Smallest k&gt;n such that phi(n) divides phi(k).
 * @author Sean A. Irvine
 */
public class A069797 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z phi = Functions.PHI.z(++mN);
    long k = mN;
    while (true) {
      if (Functions.PHI.z(++k).mod(phi).isZero()) {
        return Z.valueOf(k);
      }
    }
  }
}

