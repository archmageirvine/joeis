package irvine.oeis.a054;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054740 Cototient(n)/totient(n) when this is an integer.
 * @author Sean A. Irvine
 */
public class A054740 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z n = Z.valueOf(++mN);
      final long phi = Functions.PHI.z(n).longValueExact();
      if ((mN - phi) % phi == 0) {
        return Z.valueOf((mN - phi) / phi);
      }
    }
  }
}
