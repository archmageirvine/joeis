package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A004023 Indices of prime repunits: numbers n such that 11...111 (with n 1's) = (10^n - 1)/9 is prime.
 * @author Sean A. Irvine
 */
public class A004023 extends Sequence1 {

  private StringBuilder mS = new StringBuilder();

  @Override
  public Z next() {
    while (true) {
      mS.append('1');
      if (new Z(mS).isProbablePrime()) {
        return Z.valueOf(mS.length());
      }
    }
  }
}
