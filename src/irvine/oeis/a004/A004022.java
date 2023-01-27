package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A004022 Primes of the form (10^k - 1)/9. Also called repunit primes or repdigit primes.
 * @author Sean A. Irvine
 */
public class A004022 extends Sequence1 {

  private StringBuilder mS = new StringBuilder();

  @Override
  public Z next() {
    while (true) {
      mS.append('1');
      final Z z = new Z(mS);
      if (z.isProbablePrime()) {
        return z;
      }
    }
  }
}
