package irvine.oeis.a054;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054740 Cototient(n)/totient(n) when this is an integer.
 * @author Sean A. Irvine
 */
public class A054740 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long phi = Euler.phi(Z.valueOf(++mN)).longValueExact();
      if ((mN - phi) % phi == 0) {
        return Z.valueOf((mN - phi) / phi);
      }
    }
  }
}
