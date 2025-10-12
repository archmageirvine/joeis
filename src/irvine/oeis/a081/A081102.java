package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a007.A007524;

/**
 * A081102 Numbers k such that the first k digits of log_10(2) after the decimal point are primes.
 * @author Sean A. Irvine
 */
public class A081102 extends Sequence1 {

  private final Sequence mS = new A007524();
  private long mN = 0;
  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mA = mA.multiply(10).add(mS.next());
      if (mA.isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
